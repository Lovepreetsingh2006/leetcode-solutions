class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int check;
        for(int i=0;i<nums.length;i++){
            check=target-nums[i];
            if(map.containsKey(check)){
                int[] ans = {i, map.get(check)};
                return ans;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}