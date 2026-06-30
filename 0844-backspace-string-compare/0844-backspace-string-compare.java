class Solution {

    String check(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char a : s.toCharArray()) {

            if (stack.isEmpty() && a == '#')
                continue;

            if (!stack.isEmpty() && a == '#') {
                stack.pop();
            } else
                stack.push(a);
        }
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.insert(0, stack.pop());
        }
        return ans.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String st = check(s);
        String tt = check(t);

        return (st.equals(tt));
    }
}