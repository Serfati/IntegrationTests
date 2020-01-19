import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueIndexBottomUp {

    @Test
    public void minValueIndexNULL() {
        try {
            int minValueIndex = Program.minValueIndex(null);
            assertEquals(-1, minValueIndex);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void minValueIndexEmpty() {
        try {
            int[] arr = new int[0];
            int minValueIndex = Program.minValueIndex(arr);
            assertEquals(-1, minValueIndex);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }

    @Test
    public void minValueIndex() {
        try {
            int[] arr = {3, 4, 5, 1, 7, 3};
            int minValueIndex = Program.minValueIndex(arr);
            assertEquals(3, minValueIndex);
        } catch(Exception e) {
            fail("should not throw error");
        }
    }
}
