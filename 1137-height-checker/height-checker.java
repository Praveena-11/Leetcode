class Solution {
    public int heightChecker(int[] heights) {
        int[] dup=heights.clone();
        Arrays.sort(dup);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=dup[i]){
                count++;
            }
        }
        return count;
    }
}