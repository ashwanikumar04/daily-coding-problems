package in.ashwanik.dcp.problems.p31_60.p41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    @Test
    void testGetItinerary() {
        assertNull(new Solution().getItinerary(new String[][]{{"SFO", "COM"}, {"COM", "YYZ"}}, "COM"));
        assertArrayEquals(new String[]{"YUL", "YYZ", "SFO", "HKO", "ORD"}, new Solution().getItinerary(new String[][]{{"SFO", "HKO"}, {"YYZ", "SFO"}, {"YUL",
                "YYZ"}, {"HKO", "ORD"}}, "YUL").toArray());
        assertArrayEquals(new String[]{"A", "B", "C", "A", "C"}, new Solution().getItinerary(new String[][]{{"A", "B"}, {"A", "C"}, {"B", "C"}, {"C", "A"}}, "A").toArray());
        assertArrayEquals(new String[]{"A", "B", "A"}, new Solution().getItinerary(new String[][]{{"A", "B"}, {"B", "A"}}, "A").toArray());
    }
}