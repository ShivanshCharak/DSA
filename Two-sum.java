
#https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            h1.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int temp = target - nums[i];
            if (h1.get(temp) != null && h1.get(temp) != i) {
                arr[0] = i;
                arr[1] = h1.get(temp);
                return arr;
            }
        }
        return arr;
    }
}
