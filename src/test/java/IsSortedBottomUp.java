import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSortedBottomUp {

    @Test
    public void isSortedSorted() {
        assertTrue(Program.isSorted(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void isSortedUnsorted() {
        assertFalse(Program.isSorted(new int[]{2, 1, 3, 4, 5, 6}));
    }

    @Test
    public void isSortedReverse() {
        assertFalse(Program.isSorted(new int[]{6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void isSortedEmpty() {
        assertTrue(Program.isSorted(new int[]{}));
    }

    @Test
    public void isSortedNull() {
        assertTrue(Program.isSorted(null));
    }
}
