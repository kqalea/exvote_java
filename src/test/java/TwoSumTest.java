import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @org.junit.jupiter.api.Test
    public void twoSumTest() throws Exception {
        int target = 6;
        int[] numbers = {1, 2, 3, 4};
        int[] result;
        result = TwoSum.runTwoSum(numbers, target);
        assertTrue(numbers[result[0]] + numbers[result[1]] == target);
    }
}