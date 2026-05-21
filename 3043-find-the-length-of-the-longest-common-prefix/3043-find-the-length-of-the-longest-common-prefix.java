class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        HashSet<String> set = new HashSet<>();

        for(int n: arr1){
            String  s = String.valueOf(n);
            for(int i = 1;i <= s.length(); i++){
                set.add(s.substring(0,i));
            }
        }

        int ans = 0;

        for(int n: arr2){
            String  s = String.valueOf(n);
            for(int i = 1;i <= s.length(); i++){

                String sub = s.substring(0,i);

                if(set.contains(sub) && sub.length() > ans) ans = sub.length();
            }
        }

        return ans;
    }
}