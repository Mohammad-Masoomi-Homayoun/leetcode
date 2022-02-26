import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

  Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @Test
  void twoSumTest() {

    assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2,7,11,15}, 9));
    assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
    assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
    assertArrayEquals(new int[]{2, 4}, solution.twoSum(new int[]{-1,-2,-3,-4,-5}, -8));
  }
}
