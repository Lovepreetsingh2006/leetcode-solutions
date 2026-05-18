class Solution {
    public int maxDifference(String s) {
        
       int arr[] = new int[26];

        for(char c : s.toCharArray()){
            
            arr[c-'a'] +=1;
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i: arr){
            if(i > max && i % 2 != 0) max = i;
            if(i < min && i % 2 == 0 && i != 0) min = i;
        }
        return (max-min);
    }
}