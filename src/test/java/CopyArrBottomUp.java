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
    public void copyArrPointer() {

        int[] copy = Program.copyArr(arr);
        assertNotEquals(arr, copy);
    }

    @Test
    public void copyArrSame() {

        int[] copy = Program.copyArr(arr);
        assertArrayEquals(arr, copy);
    }

    @Test
    public void copyArrNull() {
        assertArrayEquals(null, Program.copyArr(null));
    }

    @Test
    public void copyArrEmpty() {
        assertArrayEquals(new int[]{}, Program.copyArr(new int[]{}));
    }
}