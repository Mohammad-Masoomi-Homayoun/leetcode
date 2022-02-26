import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> index = new HashMap<>();

    for(int i = 0; i<nums.length; i++) {
      int res = target - nums[i];
      Integer targetIndex = index.get(nums[i]);
      if(targetIndex != null) {
        return new int[]{targetIndex, i};
      }
      index.put(res, i);
    }
    return null;
  }
}