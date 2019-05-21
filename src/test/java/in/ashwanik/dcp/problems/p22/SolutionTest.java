package in.ashwanik.dcp.problems.p22;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testWordBreak1() {
        Set<String> dictionary = new HashSet<>(Arrays.asList("quick", "brown", "the", "fox"));
        assertTrue(new Solution(dictionary).validWords("thequickbrownfox").contains("the quick brown fox"));
    }

    @Test
    void testWordBreak2() {
        Set<String> dictionary = new HashSet<>(Arrays.asList("bed", "bath", "bedbath", "and", "beyond"));
        assertTrue(new Solution(dictionary).validWords("bedbathandbeyond").contains("bedbath and beyond"));
        assertTrue(new Solution(dictionary).validWords("bedbathandbeyond").contains("bed bath and beyond"));
    }
}
