package in.ashwanik.dcp.problems.p151_180.p180;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testInterleaveStack() {
        List<Integer> array = Arrays.asList(5, 4, 3, 2, 1);
        Deque<Integer> stack = new ArrayDeque<>(array);

        new Solution().interleaveStack(stack);

        List<Integer> returned = new ArrayList<>();

        while (!stack.isEmpty()) {
            returned.add(stack.pop());
        }

        assertArrayEquals(new Integer[]{3, 4, 2, 5, 1}, returned.toArray());
    }
}
