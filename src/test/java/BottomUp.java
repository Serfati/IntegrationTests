import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        SizeBottomUp.class,
        PrintArrBottomUp.class,

        EqualArraysBottomUp.class,
        CopyArrBottomUp.class,
        MaxValueIndexBottomUp.class,
        MinValueIndexBottomUp.class,

        SortArrayBottomUp.class,
        SwapMinMaxBottomUp.class,
        MinValueBottomUp.class,
        MaxValueBottomUp.class,

        SumMinMaxBottomUp.class,
        IsSortedBottomUp.class,
        MergeBottomUp.class,
        PrintSortedBottomUp.class
})
public class BottomUp {
}
