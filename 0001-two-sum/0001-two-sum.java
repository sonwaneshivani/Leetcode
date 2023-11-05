class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            if(mp.containsKey(target-nums[i])) {
                res[0]=mp.get(target-nums[i]);
                res[1]=i;
                return res;
            }
            mp.put(nums[i],i);
        }
        return null;
    }
}