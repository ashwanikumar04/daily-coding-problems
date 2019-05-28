package in.ashwanik.dcp.problems.p28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeetcodeTest {
    @Test
    void testJustifyText() {
        String[] text = {"The", "important", "thing", "is", "not", "to", "stop", "questioning.", "Curiosity", "has", "its", "own", "reason", "for", "existing."};
        assertArrayEquals(new String[]{"The     important", "thing  is  not to", "stop questioning.", "Curiosity has its", "own   reason  for", "existing.        "}
                , new Leetcode().fullJustify(text, 17).toArray());

        text = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        assertArrayEquals(new String[]{"This    is    an", "example  of text", "justification.  "}
                , new Leetcode().fullJustify(text, 16).toArray());
    }
}
