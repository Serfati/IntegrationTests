import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueBottomUp {

    @Test(expected = NullPointerException.class)
    public void minValueNULL() {
        int[] arr = null;
        int ans = Program.minValue(arr);
    }

    @Test
    public void minValue() {
        try {
            int[] arr = {7, 3, 6, 2, 6};
            int minValue = 2;
            int ans = Program.minValue(arr);
            assertEquals(minValue, ans);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void minValueEmpty() {
        int[] arr = new int[0];
        int ans = Program.minValue(arr);
    }

    @Test
    public void minValueMinus() {
        try {
            int[] arr = {7, -3, 6, 2, 6};
            int minValue = -3;
            int ans = Program.minValue(arr);
            assertEquals(minValue, ans);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }
}
