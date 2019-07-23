package in.ashwanik.dcp.problems.p151_180.p151;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testReplaceColor() {
        Solution solution = new Solution();
        char[][] image = new char[][]{{'R', 'R', 'B', 'B'}};
        solution.replaceColor(image, new int[]{0, 2}, 'W');

        assertImageEquals(new char[][]{{'R', 'R', 'W', 'W'}}, image);

        image = new char[][]{{'B', 'B', 'W'},
                {'W', 'W', 'W'},
                {'W', 'W', 'W'},
                {'B', 'B', 'B'}};

        char[][] expected = new char[][]{{'B', 'B', 'G'},
                {'G', 'G', 'G'},
                {'G', 'G', 'G'},
                {'B', 'B', 'B'}};

        solution.replaceColor(image, new int[]{2, 2}, 'G');
        assertImageEquals(expected, image);
    }

    private void assertImageEquals(char[][] expected, char[][] image) {
        for (int index = 0; index < expected.length; index++) {
            assertArrayEquals(expected[index], image[index]);
        }
    }
}
