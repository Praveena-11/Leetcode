class Solution {
    public int countSegments(String s) {
        String [] arr=s.split(" ");
        int count=0;

        for(String i:arr){
            if(!i.isEmpty()){
            count++;   

            }
        }

        return count;
    }
}