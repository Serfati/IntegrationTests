import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueIndexBottomUp {

    @Test
    public void maxValueIndexNULL() {
        try {
            int maxValueIndex = Program.maxValueIndex(null);
            assertEquals(-1, maxValueIndex);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void maxValueIndexEmpty() {
        try {
            int[] arr = new int[0];
            int maxValueIndex = Program.maxValueIndex(arr);
            assertEquals(-1, maxValueIndex);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void maxValueIndex() {
        try {
            int[] arr = {3, 4, 5, 2, 7, 9};
            int maxValueIndex = Program.maxValueIndex(arr);
            assertEquals(5, maxValueIndex);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }
}
