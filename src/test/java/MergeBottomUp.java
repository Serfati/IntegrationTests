import org.junit.Test;

import static org.junit.Assert.*;

public class MergeBottomUp {

    @Test
    public void merge1() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{1, 2, 3}, new int[]{5, 4, 6}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void merge2() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{}, new int[]{6, 1, 5, 3, 2, 4}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void merge3() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{6, 1, 5, 3, 2, 4}, new int[]{}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeN4() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{1, 2, 3}, new int[]{5, 4, 6}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void merge5() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{2, 1, 3}, new int[]{4, 5, 6}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void merge6() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(new int[]{2, 1, 3}, new int[]{5, 4, 6}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void merge7() {
        try {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, Program.merge(new int[]{1, 7, 3, 6}, new int[]{2, 4, 5})); // sort(a1) + sort(a2) =/= sort(a1+a2)
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeNULLNULL() {
        try {
            assertArrayEquals(null, Program.merge(null, null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeNULLEmpty() {
        try {
            assertNotNull(Program.merge(new int[0], null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeEmptyNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = new int[0];
            assertNotNull(Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeEmptyEmpty() {
        try {
            int[] arr1 = new int[0];
            int[] arr2 = new int[0];
            assertArrayEquals(arr2, Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeNULLNotNULL() {
        try {
            int[] arr1 = {1, 3, 5};
            int[] arr2 = null;
            assertArrayEquals(arr2, Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeNotNULLNULL() {
        try {
            int[] arr1 = null;
            int[] arr2 = {1, 3, 5};
            assertArrayEquals(arr2, Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void merge() {
        try {
            int[] arr1 = {0, 10, 50, 79};
            int[] arr2 = {20, 14, 2, 90};
            int[] merged = {0, 2, 10, 14, 20, 50, 79, 90};
            assertArrayEquals(merged, Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeDiffSize() {
        try {
            int[] arr1 = {2, 4, 6};
            int[] arr2 = {5, 3, 7, 1};
            int[] merged = {1, 2, 3, 4, 5, 6, 7};
            assertArrayEquals(merged, Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void mergeSameArray() {
        try {
            int[] arr1 = {1, 2, 4};
            int[] arr2 = {1, 2, 4};
            int[] merged = {1, 1, 2, 2, 4, 4};
            assertArrayEquals(merged, Program.merge(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }
}
