class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==0) return "";
        Deque<Character> stk = new ArrayDeque<>();

        for(char a : s.toCharArray()){
            
            if( !stk.isEmpty() && a == stk.peek() )
                stk.pop();
            else
                stk.push(a);
        }

        char[] ans = new char[stk.size()];
        int i = stk.size() - 1;

        for(char c : stk){ 
            ans[i] = c;
            i--;
        }

        String ans2 = new String(ans);
        return ans2;
    }
}