import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class IsSortedBottomUp {

    @Test(timeout = 100)
    public void isSorted() {

        assertTrue(Program.isSorted(new int[]{1, 2, 3, 4, 5, 6}));  // sorted

        assertFalse(Program.isSorted(new int[]{2, 1, 3, 4, 5, 6})); // not sorted
        assertFalse(Program.isSorted(new int[]{6, 5, 4, 3, 2, 1})); // reverse-sorted

        assertTrue(Program.isSorted(new int[]{})); // empty
        assertTrue(Program.isSorted(null));    // null
    }
}
