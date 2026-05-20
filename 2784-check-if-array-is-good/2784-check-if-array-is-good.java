class Solution {
    public boolean isGood(int[] nums) {
        
        int max = nums[0];

        for(int i = 1; i<nums.length;i++){
            if(max < nums[i])
            max = nums[i];
        }

        if(max > nums.length) return false;

        int[] freq = new int[nums.length+1];

        for(int i = 0; i<nums.length;i++){
            freq[nums[i]]++;
            if(nums[i] != max && freq[nums[i]] == 2) return false;
        }
        for(int i = 1; i<nums.length;i++){
            if(i != max && freq[i] != 1) return false;
        }
        if(freq[max] == 2) return true;
        else return false;
    }
}