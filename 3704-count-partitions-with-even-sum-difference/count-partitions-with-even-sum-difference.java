class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int leftsum=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=total-leftsum;
            if((leftsum%2)==(rightsum%2)){
                count++;
            }
        }
        return count;

    }
}