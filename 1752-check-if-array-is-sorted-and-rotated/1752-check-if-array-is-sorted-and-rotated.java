class Solution {
    public boolean check(int[] nums) {
        
        int p=nums.length;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] >nums[i+1]){
                p=i;
                break;
            }
        }

        //check for if array is already fully sorted so it is rotated 0 times.
        if(p==nums.length) return true;

        //check for if array is sorted after breaking point
        for(int i = p + 1;i < nums.length - 1;i++){
            if(nums[i] > nums[i+1]) return false;
        }
        
        //check for is array is valid before rotation by connecting it to first index
        for(int i = p+1;i < nums.length;i++){
            if(nums[0] < nums[i]) return false;
        }
        
        return true;
    }
}