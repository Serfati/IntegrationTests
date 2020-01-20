import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class PrintSortedBottomUp {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream screen = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void restoreStreams() {
        System.setOut(screen);
    }


    @Test
    public void printSorted() {

        Program.printSorted(new int[]{2, 1, 3});
        assertEquals("2 1 3 \n1 2 3 \n2 1 3 \n", out.toString());

    }

    @Test
    public void printSortedZero() {
        out.reset();
        Program.printSorted(new int[]{0});
        assertEquals("0 \n0 \n0 \n", out.toString());

    }

    @Test
    public void printSortedEmpty() {
        out.reset();
        Program.printSorted(new int[]{});
        assertEquals("\n\n\n", out.toString());
    }

    @Test
    public void printSortedNull() {
        out.reset();
        Program.printSorted(null);
        assertEquals("No array\n", out.toString());
    }
}
