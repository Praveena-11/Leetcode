class Solution {
  public int lengthOfLastWord(String s) {
        String[] ans=s.split(" ");
        String last=ans[ans.length-1];
        return last.length();
  }
}