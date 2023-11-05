class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int totalHours=0;
        int left=1;
        int right=Integer.MIN_VALUE;
        for(int i:piles){
            right=Math.max(right,i);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            totalHours=0;
            for(int pile:piles){
                totalHours+=Math.ceil(pile/(double)mid);
            }
            if(totalHours>h){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}