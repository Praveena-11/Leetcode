class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set<Integer> arr=new HashSet<>();
        for(int i : candyType){
            arr.add(i);
        }
        if(arr.size()<n){
            return arr.size();
        }
        return n;
    }
}