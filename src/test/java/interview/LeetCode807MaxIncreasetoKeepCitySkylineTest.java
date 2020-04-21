package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LeetCode807MaxIncreasetoKeepCitySkyline;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeetCode807MaxIncreasetoKeepCitySkylineTest {
    private LeetCode807MaxIncreasetoKeepCitySkyline program;

    @BeforeMethod
    public void setUp() {
        program = new LeetCode807MaxIncreasetoKeepCitySkyline();
    }

    @Test
    public void testName() {
        int[][] input = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        assertThat(program.maxIncreaseKeepingSkyline(input)).isEqualTo(35);
    }
}