package in.ashwanik.dcp.problems.p31_60.p39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testNextGeneration() {
        boolean[][] current = {{false, false, false, false, false, false, false, false, false, false},
                {false, false, false, true, true, false, false, false, false, false},
                {false, false, false, false, true, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, true, true, false, false, false, false, false},
                {false, false, true, true, false, false, false, false, false, false},
                {false, false, false, false, false, true, false, false, false, false},
                {false, false, false, false, true, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}
        };
        boolean[][] next = {{false, false, false, false, false, false, false, false, false, false},
                {false, false, false, true, true, false, false, false, false, false},
                {false, false, false, true, true, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, true, true, true, false, false, false, false, false},
                {false, false, true, true, false, false, false, false, false, false},
                {false, false, false, true, true, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}};

        boolean[][] result = new Solution().nextGeneration(current);

        for (int index = 0; index < current.length; index++) {
            assertArrayEquals(next[index], result[index]);
        }
    }
}
