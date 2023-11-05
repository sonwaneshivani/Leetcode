class Solution {
    int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int b=n%10;
            sum+=(b*b);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(true){
            int sum=sumOfDigits(n);
            if(hs.contains(sum)) return false;
            if(sum==1) return true;
            hs.add(sum);
            n=sum;
        }
    }
}