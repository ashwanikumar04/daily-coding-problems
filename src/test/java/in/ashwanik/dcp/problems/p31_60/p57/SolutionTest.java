package in.ashwanik.dcp.problems.p31_60.p57;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    @Test
    public void testBreak() {
        assertArrayEquals(new String[]{"the quick", "brown fox", "jumps over", "the lazy",
                "dog"}, new Solution().breakSentence("the quick brown fox jumps over the lazy dog", 10).toArray());

        assertNull(new Solution().breakSentence("the quick brown fox jumps over the lazy dog", 3));
    }
}
