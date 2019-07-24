package in.ashwanik.dcp.problems.p151_180.p159;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    @Test
    void testGetRecurring() {

        assertAll(() -> assertEquals(new Character('b'), new Solution().findRecurring("acbbac")),
                () -> assertNull(new Solution().findRecurring("abcd")));
    }

}
