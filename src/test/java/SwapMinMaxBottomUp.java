import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class SwapMinMaxBottomUp {

    @Test
    public void swapMinMaxNULL() {
        try {
            assertArrayEquals(null, Program.swapMinMax(null));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void swapMinMaxEmpty() {
        try {
            assertArrayEquals(null, Program.swapMinMax(new int[0]));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void swapMinMax() {
        try {
            int[] arr = {6, 2, 8, 1, 3, 9};
            int[] swap = {6, 2, 8, 9, 3, 1};
            assertArrayEquals(swap, Objects.requireNonNull(Program.swapMinMax(arr)));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMin() {
        try {
            int[] arr = {6, 1, 2, 8, 1, 3, 9};
            int[] swap = {6, 9, 2, 8, 1, 3, 1};
            assertArrayEquals(swap, Objects.requireNonNull(Program.swapMinMax(arr)));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMax() {
        try {
            int[] arr = {6, 2, 9, 8, 1, 3, 9};
            int[] swap = {6, 2, 1, 8, 9, 3, 9};
            assertArrayEquals(swap, Objects.requireNonNull(Program.swapMinMax(arr)));
        } catch(Exception e) {
            fail("error");
        }
    }

    @Test
    public void swapMinMaxRepeatedMinRepeatedMax() {
        try {
            int[] arr = {6, 2, 1, 8, 1, 9, 3, 9};
            int[] swap = {6, 2, 9, 8, 1, 1, 3, 9};
            assertArrayEquals(swap, Objects.requireNonNull(Program.swapMinMax(arr)));
        } catch(Exception e) {
            fail("error");
        }
    }
}