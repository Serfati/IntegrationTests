import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueBottomUp {

    @Test
    public void maxValueNULL() {
        try {
            assertEquals(Program.maxValue(null), -1);
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void maxValue() {
        try {
            int[] arr = {5, 2, 3, 10, 1};
            assertEquals(10, Program.maxValue(arr));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void maxValueEmpty() {
        assertEquals(-1, Program.maxValue(new int[0]));
    }

    @Test
    public void maxValueMinus() {
        try {
            int[] arr = {-5, -7, -3, -6, -2};
            assertEquals(-2, Program.maxValue(arr));
        } catch(Exception e) {
            fail("error");
        }
    }
}
