class Solution {
    public boolean checkIfPangram(String sentence) {
        Set <Character> set=new HashSet<>();
        for(char i:sentence.toCharArray()){
            set.add(i);
        }
        return set.size()==26;
    }
}