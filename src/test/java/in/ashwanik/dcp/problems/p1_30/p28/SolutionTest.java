package in.ashwanik.dcp.problems.p1_30.p28;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testJustifyText() {
        List<String> text = Arrays.asList("the", "quick", "brown", "fox", "jumps",
                "over", "the", "lazy", "dog");
        assertArrayEquals(new String[]{"the  quick brown", "fox  jumps  over", "the   lazy   dog"}, new Solution().justifyText(text, 16).toArray());
    }
}
