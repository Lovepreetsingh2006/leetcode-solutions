class Solution {
    public boolean check(int[] nums) {
        
        int p=nums.length;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] >nums[i+1]){
                p=i;
                break;
            }
        }
        
        if(p==nums.length) return true;

        for(int i = p + 1;i < nums.length - 1;i++){
            if(nums[i] > nums[i+1]) return false;
        }
        
        for(int i = p+1;i < nums.length;i++){
            if(nums[0] < nums[i]) return false;
        }
        
        return true;
    }
}