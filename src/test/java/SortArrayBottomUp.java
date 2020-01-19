import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortArrayBottomUp {
    int[] arr;
    int[] ready;
    int[] sorted;

    @Before
    public void setUp() {
        arr = new int[]{1, 7, 6, 3};
        ready = new int[]{1, 3, 5, 7};
        sorted = new int[]{1, 3, 6, 7};
    }

    @Test
    public void sortArray() {
        assertTrue(Program.equalArrays(Program.sortArray(arr), sorted));
        assertTrue(Program.equalArrays(Program.sortArray(ready), ready));

        assertTrue(Program.equalArrays(Program.sortArray(null), null));
        assertTrue(Program.equalArrays(Program.sortArray(new int[]{}), new int[]{}));
    }
}