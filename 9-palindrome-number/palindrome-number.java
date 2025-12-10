class Solution {
    public boolean isPalindrome(int num) {
        if(num<0){
            return false;
        }
        int rev=0;
        int n=num;
        while(n>0){
            int l=n%10;
            rev=rev*10+l;
            n=n/10;
        }
        return num==rev;
    }
}