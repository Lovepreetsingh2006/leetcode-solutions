class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> no = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[i]<=9) 
                ans.add(nums[i]);

            else{
                while(nums[i]>0){
                    no.add(nums[i] % 10);
                    nums[i] /= 10;
                }
                Collections.reverse(no);
                ans.addAll(no);
                no.clear();
            }
        }

        int[] ans2 = new int[ans.size()];

        for(int i = 0;i<ans.size();i++){
            ans2[i] = ans.get(i);
        }

        return ans2;
    }
}