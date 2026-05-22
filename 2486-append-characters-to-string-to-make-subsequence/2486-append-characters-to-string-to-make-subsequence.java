class Solution {
    public int appendCharacters(String s, String t) {
        
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        int i;
        int j = 0;

        for(i = 0; i < st.length && j < tt.length;i++){
            if(st[i] == tt[j]){
                j++;
            }
        }
        return (tt.length - j);
    }
}