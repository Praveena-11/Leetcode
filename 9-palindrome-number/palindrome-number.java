class Solution {
    public boolean isPalindrome(int num) {
        if(num<0){
            return false;
        }
        int sum=0;
        int n=num;
        while(n>0){
            int rem=n%10;
            sum=sum*10 +rem;
            n=n/10;
        }
        return num==sum;
    }
}