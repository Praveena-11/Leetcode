class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int left=0;
        int right=nums.length-1;
        while(left<nums.length && nums[left]==arr[left]){
            left++;
        }
        while(right>left && nums[right]==arr[right]){
            right--;
        }
        return (right-left+1==0) ? 0:right-left+1;

    }
}