class Solution {
    public int firstMissingPositive(int[] nums) {

        int i = 0;

        while(i < nums.length){
             int corindex = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] > 0 && (nums[i] - 1) != i && nums[i] != nums[corindex]){
                
                int temp = nums[corindex];
                nums[corindex] = nums[i];
                nums[i] = temp;
            }
            else i++;
        }

        i = 0;
        while(i<nums.length){
            if(nums[i] != (i+1)){ 
                break;
            }
            i++;
        }
        int ans = i+1;
        return ans;
    }
}