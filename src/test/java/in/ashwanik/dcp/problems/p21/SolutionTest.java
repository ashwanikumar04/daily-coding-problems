package in.ashwanik.dcp.problems.p21;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMinimumNumberOfRooms() {
        List<int[]> entries = new ArrayList<>();
        entries.add(new int[]{30, 75});
        entries.add(new int[]{0, 50});
        entries.add(new int[]{60, 150});


        assertEquals(2, new Solution().getMinimumNumberOfRooms(entries));
    }
}
