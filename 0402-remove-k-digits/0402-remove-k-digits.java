class Solution {
    public String removeKdigits(String num, int k) {

        Deque<Character> st = new ArrayDeque<>();
        
        if((num.length() == k)) return "0";
        
        for (char c : num.toCharArray()) {
            
             if(st.size() == 1 && st.peek()=='0'){
                st.pop();
                k--;
            }
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            if(st.isEmpty() && c == '0') continue;
            st.push(c);
            
        }
        
        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }
        
        char[] arr = new char[st.size()];
        
        int i = st.size() - 1;
        for (char c : st) {
            arr[i] = c;
            i--;
        }

        String ans = new String(arr);
        if(ans.length() == 0) return "0";
        return ans;
    }
}