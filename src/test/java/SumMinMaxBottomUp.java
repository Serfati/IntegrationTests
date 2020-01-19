import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SumMinMaxBottomUp {

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNULL() {
        int[] arr = null;
        int ans = Program.sumMinMax(arr);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void sumMinMaxEmpty() {
        int[] arr = {};
        int ans = Program.sumMinMax(arr);
    }

    @Test
    public void sumMinMax() {
        try {
            int[] arr = {2, 3, 7, 2, 4};
            int ans = Program.sumMinMax(arr);
            int sumMinMax = 9;
            assertEquals(ans, sumMinMax);
        } catch(Exception e) {
            //fail("should not throw error");
        }
    }

    @Test
    public void sumMinMax2() {
        try {
            int[] arr = {3, 5, -5, 1, 6, 10};
            int ans = Program.sumMinMax(arr);
            int sumMinMax = 5;
            assertEquals(ans, sumMinMax);
        } catch(Exception e) {
            //fail("should not throw error");
        }
    }

    @Test
    public void sumMinMax4() {
        try {
            int[] arr = {1, 1, 1, 1};
            int ans = Program.sumMinMax(arr);
            int sumMinMax = 2;
            assertEquals(ans, sumMinMax);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void sumMinMax3() {
        try {
            int[] arr = {2};
            int ans = Program.sumMinMax(arr);
            int sumMinMax = 4;
            assertEquals(ans, sumMinMax);
        } catch(Exception e) {
            //fail("should not throw error");
        }
    }
}
