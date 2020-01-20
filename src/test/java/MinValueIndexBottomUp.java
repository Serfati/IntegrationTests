import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueIndexBottomUp {

    @Test
    public void minValueIndexNULL() {
        try {
            assertEquals(-1, Program.minValueIndex(null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void minValueIndexEmpty() {
        try {
            assertEquals(-1, Program.minValueIndex(new int[0]));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void minValueIndex() {
        try {
            int[] arr = {3, 4, 5, 1, 7, 3};
            assertEquals(3, Program.minValueIndex(arr));
        } catch(Exception e) {
            fail("error");
        }
    }
}
