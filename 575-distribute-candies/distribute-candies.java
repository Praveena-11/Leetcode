class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int n=candyType.length/2;
        for(int i:candyType){
            set.add(i);
        }if(n<set.size()){
            return n;
        }
        return set.size();
    }
}