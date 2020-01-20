import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SumMinMaxBottomUp {

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNULL() {
        int[] arr = null;
        int ans = Program.sumMinMax(arr);
    }

    @Test
    public void sumMinMaxEmpty() {
        try {
            assertEquals(Program.sumMinMax(new int[0]), 0);
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void sumMinMax() {
        try {
            int[] arr = {2, 3, 7, 2, 4};
            assertEquals(Program.sumMinMax(arr), 9);
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void sumMinMax2() {
        try {
            int[] arr = {3, 5, -5, 1, 6, 10};
            assertEquals(Program.sumMinMax(arr), 5);
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void sumMinMax4() {
        try {
            int[] arr = {1, 1, 1, 1};
            assertEquals(Program.sumMinMax(arr), 2);
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void sumMinMax3() {
        try {
            int[] arr = {2};
            assertEquals(Program.sumMinMax(arr), 4);
        } catch(Exception e) {
            fail("error");
        }
    }
}
