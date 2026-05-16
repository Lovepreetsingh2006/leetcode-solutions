class Solution {
    public String removeKdigits(String num, int k) {
        
        if(num.length() == k) return "0";

        Deque<Character> stk = new ArrayDeque<>();

        for (char c : num.toCharArray()) {

            if(stk.size() == 1 && stk.peek() == '0') {
                stk.pop();
                k--;
            }
            while(!stk.isEmpty() && k > 0 && stk.peek() > c){
                stk.pop();
                k--;
            }
            if(stk.isEmpty() && c =='0') continue;

            stk.push(c);
        }

        while(!stk.isEmpty() && k > 0){
            stk.pop();
            k--;
        }

        char[] arr = new char[stk.size()];
        int i = stk.size() - 1;
        for (char c : stk) {
            arr[i] = c;
            i--;
        }

        String ans = new String(arr);
        if(ans.length() == 0) return "0";
        return ans;
    }
}