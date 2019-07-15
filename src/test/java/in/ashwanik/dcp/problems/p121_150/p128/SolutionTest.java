package in.ashwanik.dcp.problems.p121_150.p128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testTowerOfHanoi() {
        assertArrayEquals(new String[]{"Move 1 to 3",
                "Move 1 to 2",
                "Move 3 to 2",
                "Move 1 to 3",
                "Move 2 to 1",
                "Move 2 to 3",
                "Move 1 to 3"}, new Solution().towerOfHanoi(3).toArray());
    }
}
