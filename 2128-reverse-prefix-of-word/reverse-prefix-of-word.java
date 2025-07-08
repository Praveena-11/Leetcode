class Solution {
    public String reversePrefix(String word, char ch) {
        int l=word.indexOf(ch);
        if(l==-1) return word;
        char [] arr = word.toCharArray();
        int i=0;
        int j=l;
        while(j>i){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}