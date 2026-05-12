class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            String s = Integer.toString(nums[i]);
            
            for(char c : s.toCharArray()){
                
                int n = (c - '0');
                ans.add(n);
            }
        }
        
        int[] arr = new int[ans.size()];
        for(int i =0;i<ans.size();i++)
            arr[i] = ans.get(i);
        
        return arr;
    }
}