class Solution {
    public String reversePrefix(String word, char ch) {
        char [] arr=word.toCharArray();
        int start=0,end=word.indexOf(ch);
        if(end==-1)return word;

        while(end>start){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}