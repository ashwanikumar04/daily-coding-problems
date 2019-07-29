package in.ashwanik.dcp.problems.p151_180.p166;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testArrayIterator() {

        Solution solution = new Solution(new int[][]{});

        Iterator<Integer> iterator = solution.iterator();

        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertArrayEquals(new Integer[]{}, list.toArray());

        solution = new Solution(new int[][]{{1, 2}, {3}, {}, {4, 5, 6}});

        iterator = solution.iterator();

        list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, list.toArray());
    }

}
