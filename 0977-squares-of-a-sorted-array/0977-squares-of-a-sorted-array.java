class Solution {
    public int[] sortedSquares(int[] nums) {

        int minpos = -1;
        boolean flag = true;

        for(int i = 0;i<nums.length;i++){

            if(nums[i] >= 0 && flag){
                minpos = i;
                flag = false;
            }
            nums[i] *= nums[i];
        }

        int[] ans = new int[nums.length];

        int neg = 0;
        if(minpos < 0) {
            minpos = nums.length;
            neg = minpos - 1;
        }
        else neg = minpos - 1;

        for(int i = 0;i<nums.length;i++){
        
            if(neg < 0){
                ans[i] = nums[minpos++];
            }
            else if(minpos >= nums.length){
                ans[i] = nums[neg--];
            }
            else{
                if(nums[minpos] < nums[neg]){
                    ans[i] = nums[minpos++];
                }
                else
                    ans[i] = nums[neg--];
            }
        }

        return ans;
    }
}