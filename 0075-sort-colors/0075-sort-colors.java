class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int last = nums.length-1;

        while(j <= last){
        
            if(nums[j] == 0){
                int temp = nums[i];
                nums[i++] = 0;
                nums[j++] = temp; 
            }
            else if(nums[j] == 2){
                int temp = nums[last];
                nums[last--] = 2;
                nums[j] = temp;
            }
            else{
                j++;
            }
            
        }
        return;
    }
}