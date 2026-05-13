class Solution {
    public int mySqrt(int x) {

        if(x <= 1) return x;

        long low = 1;
        long high = x;

        while(high >= low){

            long mid = low + (high - low) / 2;
            long sqrt = mid * mid;

            if(x == sqrt) return (int)mid;

            else if(sqrt > x) high = mid - 1;

            else low = mid + 1;
        }

        return (int)high;
    }
}