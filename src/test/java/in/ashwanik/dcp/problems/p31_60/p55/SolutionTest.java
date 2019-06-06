package in.ashwanik.dcp.problems.p31_60.p55;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testShortUrl() {
        Solution solution = new Solution(1000);
        assertEquals("www.google.com", solution.decode(solution.encode("www.google.com")));
    }
}
