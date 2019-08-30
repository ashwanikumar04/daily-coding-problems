package in.ashwanik.dcp.problems.p211_p240.p213;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testValidIps() {
        assertArrayEquals(new String[]{"254.25.40.123", "254.254.0.123"}, new Solution().generatePossibleIps("2542540123").toArray());
    }
}
