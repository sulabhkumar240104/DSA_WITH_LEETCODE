import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current number and its index in the map
            map.put(nums[i], i);
        }
        
        // This line will never be reached because there is always one solution
        throw new IllegalArgumentException("No two sum solution");
    }
}
