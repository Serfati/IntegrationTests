import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualArraysBottomUp {
    int[] arr1;
    int[] arr2;
    int[] arr3;
    int[] arr4;

    @Before
    public void setUp() throws Exception {
        arr1 = new int[]{3, 2, 1};
        arr2 = new int[]{3, 2, 1};
        arr3 = new int[]{2, 3, 1};
        arr4 = new int[]{};
    }


    @Test(timeout = 100)
    public void equalArrays() {
        assertTrue(Program.equalArrays(arr1, arr2));//equal
        assertFalse(Program.equalArrays(arr1, arr3));//diff order
        assertFalse(Program.equalArrays(arr1, arr4));// dif size

        assertFalse(Program.equalArrays(arr1, null)); // second null
        assertFalse(Program.equalArrays(null, arr1)); // first null
        assertTrue(Program.equalArrays(null, null));  // both null

        assertFalse(Program.equalArrays(arr1, new int[]{}));        // second empty
        assertFalse(Program.equalArrays(new int[]{}, arr1));        // first empty
        assertTrue(Program.equalArrays(new int[]{}, new int[]{})); // both empty

        assertFalse(Program.equalArrays(null, new int[]{}));        // null-empty
        assertFalse(Program.equalArrays(new int[]{}, null));        // empty-null
    }
}