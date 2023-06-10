# Leet code https://leetcode.com/problems/contains-duplicate/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(h1.get(nums[i])==null){
                  h1.put(nums[i],1);
            }
            else return true;
          
        }
        return false;
    }
}
