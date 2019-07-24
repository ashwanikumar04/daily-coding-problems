package in.ashwanik.dcp.problems.p151_180.p156;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMinimumNumberOfSquare() {
        assertAll(() -> assertEquals(2, new Solution().minimumNumberOfSquaresBF(13)),
                () -> assertEquals(3, new Solution().minimumNumberOfSquaresBF(27)),
                () -> assertEquals(2, new Solution().minimumNumberOfSquaresDP(13)),
                () -> assertEquals(3, new Solution().minimumNumberOfSquaresDP(27)));
    }
}
