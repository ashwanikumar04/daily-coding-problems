package in.ashwanik.dcp.problems.p151_180.p171;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testPeriod() {
        List<Solution.Entry> entries = new ArrayList<>();
        entries.add(new Solution.Entry(1526579928, 3, "entry"));
        entries.add(new Solution.Entry(1526580382, 2, "exit"));
        entries.add(new Solution.Entry(1526580389, 2, "entry"));
        entries.add(new Solution.Entry(1526580482, 1, "exit"));
        entries.add(new Solution.Entry(1526580582, 1, "enter"));
        entries.add(new Solution.Entry(1526580682, 3, "exit"));

        Solution.Pair period = new Solution().getPeriod(entries);

        assertEquals(1526579928, period.getStart());
        assertEquals(1526580382, period.getEnd());
    }
}
