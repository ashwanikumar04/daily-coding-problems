package in.ashwanik.dcp.problems.p211_p240.p212;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testExcelColumn(){
        assertEquals("AA",new Solution().getExcelColumn(27));
        assertEquals("CB",new Solution().getExcelColumn(80));
        assertEquals("AAC",new Solution().getExcelColumn(705));
    }
}
