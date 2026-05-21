class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        while(true){
            int temp = 0;

            while(n > 0){             
                int no = n % 10;
                n /= 10;
                temp += no*no; 
            }

            n = temp;
            if(set.contains(n)) break;
            
            if(n == 1) return true;
            else set.add(n);
        }
    return false;
    }
}