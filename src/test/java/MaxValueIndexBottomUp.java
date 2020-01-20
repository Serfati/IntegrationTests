import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueIndexBottomUp {

    @Test
    public void maxValueIndexNULL() {
        try {
            assertEquals(-1, Program.maxValueIndex(null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void maxValueIndexEmpty() {
        try {
            assertEquals(-1, Program.maxValueIndex(new int[0]));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void maxValueIndex() {
        try {
            int[] arr = {3, 4, 5, 2, 7, 9};
            assertEquals(5, Program.maxValueIndex(arr));
        } catch(Exception e) {
            fail("error");
        }
    }
}
