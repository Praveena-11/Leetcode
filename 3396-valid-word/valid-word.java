class Solution {
    public boolean isValid(String word) {
        if (word.length()<3){
            return false;
        }
        boolean hv=false;
        boolean hc=false;
        for(char c:word.toCharArray()){
            if(Character.isLetter(c)){
                char ch=Character.toLowerCase(c);
                if(
                    ch=='a' ||
                    ch=='e' ||
                    ch=='i' ||
                    ch=='o' ||
                    ch=='u'
                ){
                    hv=true;
                }else{
                    hc=true;
                }
            }else if(!Character.isDigit(c)){
                return false;
            }
        }
        return hv && hc;
    }
}