package in.ashwanik.dcp.problems.p31_60.p58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    @Test
    public void testFindNumber() {
        assertEquals(4, new Solution().findNumber(new int[]{13, 18, 25, 2, 8, 10}, 8));
        assertNull(new Solution().findNumber(new int[]{13, 18, 25, 2, 8, 10}, 11));
    }
}
