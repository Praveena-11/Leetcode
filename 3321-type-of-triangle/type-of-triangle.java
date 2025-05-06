class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> rd=new HashSet<>();
        for(int i:nums){
            rd.add(i);
        }
        if(rd.size()==1){
            return "equilateral";
        }else if(rd.size()==2 && nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            return "isosceles";
        }else if(rd.size()==3 && nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            return "scalene";
        }else{
            return "none";
        }

    }
}