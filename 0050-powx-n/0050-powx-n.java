class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        double y=x;
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            y = y * y;
            n = n / 2;
        }
        if (n < 0) {
            y = 1 / y;
            n = -n;
        }
        while(n>0){
            if((n&1)==1){
                ans=ans*y;
            }
            y=y*y;
            n=n>>1;
        }
        return ans;
    }
}