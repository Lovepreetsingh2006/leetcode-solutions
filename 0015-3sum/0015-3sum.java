class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i = 0;i<nums.length-1;i++){

            int left = i+1;
            int right = nums.length -1;
            int target = -nums[i];

            if(set.contains(target)) continue;
            else set.add(target);

            while(left<right){

                int a = nums[left] + nums[right];

                if(a==target){
                    List<Integer> c = new ArrayList<>(List.of(nums[i],nums[left],nums[right]));
                    ans.add(c);

                    if(nums[left] == nums[left+1])
                    while(left<right && nums[left] == nums[left+1]) left++;
                    if(nums[right] == nums[right-1])
                    while(left<right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                }
                else if(a < target) left++;
                else right--;
            }
        }
        return ans;
    }
}