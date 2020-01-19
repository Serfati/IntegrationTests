import org.junit.Test;

import static org.junit.Assert.*;

public class MergeBottomUp {


    @Test(timeout = 100)
    public void mergeMain() {

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{1, 2, 3}, new int[]{4, 5, 6})); // both sorted
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{1, 2, 3}, new int[]{5, 4, 6})); // only first sorted
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{2, 1, 3}, new int[]{4, 5, 6})); // only second sorted
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{2, 1, 3}, new int[]{5, 4, 6})); // both unsorted

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{2, 1}, new int[]{5, 4, 3, 6})); // different size
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{5, 4, 3, 6}, new int[]{2, 1})); // different size

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, Program.merge(new int[]{1, 7, 3, 6}, new int[]{2, 4, 5})); // sort(a1) + sort(a2) =/= sort(a1+a2)

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(null, new int[]{6, 1, 5, 3, 2, 4})); // first null
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{6, 1, 5, 3, 2, 4}, null)); // second null
        assertArrayEquals(null, Program.merge(null, null));                             // both null

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{}, new int[]{6, 1, 5, 3, 2, 4})); // first empty
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{6, 1, 5, 3, 2, 4}, new int[]{})); // second empty
        assertArrayEquals(new int[]{}, Program.merge(new int[]{}, new int[]{}));                       // both empty

        assertArrayEquals(new int[]{}, Program.merge(new int[]{}, null)); // first empty, second null
        assertArrayEquals(new int[]{}, Program.merge(null, new int[]{})); // first null, second empty
    }


    @Test
    public void mergeNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = null;
            int[] merged = Program.merge(arr1, arr2);
            assertEquals(null, merged);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeNULLEmpty() {
        try {
            int[] arr1 = new int[0];
            int[] arr2 = null;
            int[] merged = Program.merge(arr1, arr2);
            assertNotNull(merged);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeEmptyNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = new int[0];
            int[] merged = Program.merge(arr1, arr2);
            assertNotNull(merged);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeEmptyEmpty() {
        try {
            int[] arr1 = new int[0];
            int[] arr2 = new int[0];
            int[] merged = Program.merge(arr1, arr2);
            assertNotNull(merged);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeNULLNotNULL() {
        try {
            int[] arr1 = {2, 6, 8};
            int[] arr2 = null;
            int[] merged = Program.merge(arr1, arr2);
            assertArrayEquals(arr1, merged);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeNotNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = {2, 6, 8};
            int[] merged = Program.merge(arr1, arr2);
            assertArrayEquals(merged, arr2);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void merge() {
        try {
            int[] arr1 = {71, 12, 55, 73};
            int[] arr2 = {18, 14, 2, 72};
            int[] merged = {2, 12, 14, 18, 55, 71, 72, 73};
            int[] mergedAns = Program.merge(arr1, arr2);
            assertArrayEquals(merged, mergedAns);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeDiffSize() {
        try {
            int[] arr1 = {2, 4, 6};
            int[] arr2 = {5, 3, 7, 9, 1};
            int[] merged = {1, 2, 3, 4, 5, 6, 7, 9};
            int[] mergedAns = Program.merge(arr1, arr2);
            assertArrayEquals(merged, mergedAns);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void mergeSameArray() {
        try {
            int[] arr1 = {2, 4, 6};
            int[] arr2 = {2, 4, 6};
            int[] merged = {2, 2, 4, 4, 6, 6};
            int[] mergedAns = Program.merge(arr1, arr2);
            assertArrayEquals(merged, mergedAns);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }
}
