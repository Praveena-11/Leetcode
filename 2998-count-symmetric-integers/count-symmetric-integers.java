class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            String s=Integer.toString(num);
            int len=s.length();
            if(len%2!=0)continue;

            int mid=len/2;
            int leftsum=0,rightsum=0;
            for(int i=0;i<mid;i++){
                leftsum+=s.charAt(i)-'0';
                rightsum+=s.charAt(i+mid)-'0';        
            }
            if(leftsum==rightsum){
            count++;
            }
        }
        return count;
    }
}