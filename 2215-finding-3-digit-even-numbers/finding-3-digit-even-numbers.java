import java.util.*;

public class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new TreeSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // hundreds place can't be 0
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) continue;
                    if (digits[k] % 2 == 0) { // even number
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        resultSet.add(num);
                    }
                }
            }
        }

        // Convert set to int[]
        int[] result = new int[resultSet.size()];
        int idx = 0;
        for (int num : resultSet) {
            result[idx++] = num;
        }
        return result;
    }
}
