class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int d=arr[i+1]-arr[i];
            int d2=arr[i+2]-arr[i+1];
            if(d!=d2){
                return false;
            }
            
        }
        return true;
    }
}