import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueBottomUp {

    @Test(expected = NullPointerException.class)
    public void minValueNULL() {
        int ans = Program.minValue(null);
    }

    @Test
    public void minValue() {
        try {
            int[] arr = {7, 3, 6, 2, 6};
            assertEquals(2, Program.minValue(arr));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void minValueEmpty() {
        int ans = Program.minValue(new int[0]);
    }

    @Test
    public void minValueMinus() {
        try {
            int[] arr = {7, -3, 6, 2, 6};
            assertEquals(-3, Program.minValue(arr));
        } catch(Exception e) {
            fail("error");
        }
    }
}
