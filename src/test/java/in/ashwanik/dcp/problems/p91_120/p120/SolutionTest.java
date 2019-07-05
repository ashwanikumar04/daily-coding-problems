package in.ashwanik.dcp.problems.p91_120.p120;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void testSingleton() {
        assertFalse(Solution.getInstance().isOdd());
        assertTrue(Solution.getInstance().isOdd());
    }
}
