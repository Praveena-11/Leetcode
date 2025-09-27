class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                ans.append(s.charAt(i));
            }else{
                char prev=s.charAt(i-1);
                int shift = s.charAt(i)-'0';
                ans.append((char)(prev+shift));

            }
        }
        return ans.toString();
    }
}