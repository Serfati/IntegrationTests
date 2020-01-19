import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SwapMinMaxBottomUp {

    @Test
    public void swapMinMaxNULL() {
        try {
            int[] swap = Program.swapMinMax(null);
            assertEquals(null, swap);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxEmpty() {
        try {
            int[] arr = {};
            int[] swap = Program.swapMinMax(arr);
            assertEquals(null, swap);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMax() {
        try {
            int[] arr = {6, 2, 8, 1, 3, 9};
            int[] swap = {6, 2, 8, 9, 3, 1};
            int[] ans = Program.swapMinMax(arr);
            for(int i = 0; i < arr.length; i++) {
                assertEquals(swap[i], ans[i]);
            }
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMin() {
        try {
            int[] arr = {6, 1, 2, 8, 1, 3, 9};
            int[] swap = {6, 9, 2, 8, 1, 3, 1};
            int[] ans = Program.swapMinMax(arr);
            for(int i = 0; i < arr.length; i++) {
                assertEquals(swap[i], ans[i]);
            }
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMax() {
        try {
            int[] arr = {6, 2, 9, 8, 1, 3, 9};
            int[] swap = {6, 2, 1, 8, 9, 3, 9};
            int[] ans = Program.swapMinMax(arr);
            for(int i = 0; i < arr.length; i++) {
                assertEquals(swap[i], ans[i]);
            }
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMinRepeatedMax() {
        try {
            int[] arr = {6, 2, 1, 8, 1, 9, 3, 9};
            int[] swap = {6, 2, 9, 8, 1, 1, 3, 9};
            int[] ans = Program.swapMinMax(arr);
            for(int i = 0; i < arr.length; i++) {
                assertEquals(swap[i], ans[i]);
            }
        } catch(Exception e) {
            fail("should not throw error");
        }
    }
}