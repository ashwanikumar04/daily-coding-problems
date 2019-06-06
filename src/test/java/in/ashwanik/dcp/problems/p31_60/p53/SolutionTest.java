package in.ashwanik.dcp.problems.p31_60.p53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testQueue() {
        Solution solution = new Solution();
        solution.enqueue(1);
        solution.enqueue(2);
        solution.enqueue(3);
        assertEquals(1, solution.dequeue());
        assertEquals(2, solution.dequeue());
        solution.enqueue(4);
        solution.enqueue(5);
        solution.enqueue(6);
        assertEquals(3, solution.dequeue());
        assertEquals(4, solution.dequeue());
    }
}
