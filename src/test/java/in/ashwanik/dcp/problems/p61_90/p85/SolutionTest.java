package in.ashwanik.dcp.problems.p61_90.p85;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testGet() {
        assertEquals(5, new Solution().get(5, 4, 1));
        assertEquals(4, new Solution().get(5, 4, 0));
    }
}
