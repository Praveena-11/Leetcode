class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {
            ans[j] = arr[i];
            if (arr[i] == 0 && j + 1 < n) {
                j++;
                ans[j] = 0; 
            }
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }

        System.out.println(Arrays.toString(arr));
    }

}