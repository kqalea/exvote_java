import java.util.HashMap;

public class TwoSum {

    public static int[] runTwoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement;
        for (int i = 0; i < numbers.length; i++) {
            complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No Solution");
    }

}