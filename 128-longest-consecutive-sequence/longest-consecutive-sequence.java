class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int cur=1;
        int lon=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else if(nums[i]==nums[i-1]+1){
                cur++;
            }else{
                lon=Math.max(cur,lon);
                cur=1;
            }
        }
        return Math.max(lon,cur);

    }
}