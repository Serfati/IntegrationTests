import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class CopyArrBottomUp {
    int[] arr;

    @Before
    public void setUp() {
        arr = new int[]{2, 4, 6};
    }

    @Test
    public void copyArr() {

        int[] copy = Program.copyArr(arr);

        assertNotEquals(arr, copy);   // not the same pointer
        assertArrayEquals(arr, copy); // same values

        assertArrayEquals(null, Program.copyArr(null));       // null test
        assertArrayEquals(new int[]{}, Program.copyArr(new int[]{})); // empty test
    }
}