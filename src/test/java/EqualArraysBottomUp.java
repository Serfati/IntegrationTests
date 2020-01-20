import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualArraysBottomUp {
    int[] arr1;
    int[] arr2;
    int[] arr3;
    int[] arr4;

    @Before
    public void setUp() {
        arr1 = new int[]{3, 2, 1};
        arr2 = new int[]{3, 2, 1};
        arr3 = new int[]{2, 3, 1};
        arr4 = new int[]{};
    }

    @Test(timeout = 100)
    public void equalArrayEqual() {
        try {
            assertTrue(Program.equalArrays(arr1, arr2));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayDiffSize() {
        try {
            assertFalse(Program.equalArrays(arr1, arr3));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayDifSize() {
        try {
            assertFalse(Program.equalArrays(arr1, arr4));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArraySecNull() {
        try {
            assertFalse(Program.equalArrays(arr1, null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayFirstNull() {
        try {
            assertFalse(Program.equalArrays(null, arr1));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayNullNull() {
        try {
            assertTrue(Program.equalArrays(null, null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArraySecEmpty() {
        try {
            assertFalse(Program.equalArrays(arr1, new int[]{}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayFirstEmpty() {
        try {
            assertFalse(Program.equalArrays(new int[]{}, arr1));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayBothEmpty() {
        try {
            assertTrue(Program.equalArrays(new int[]{}, new int[]{}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayNullEmpty() {
        try {
            assertFalse(Program.equalArrays(null, new int[]{}));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(timeout = 100)
    public void equalArrayEmptyNull() {
        try {
            assertFalse(Program.equalArrays(new int[]{}, null));
        } catch(Exception e) {
            fail("error");
        }
    }
}