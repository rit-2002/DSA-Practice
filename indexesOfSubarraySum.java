import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            // Shrink the window from the left if currentSum exceeds target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if currentSum equals target
            if (currentSum == target) {
                // Return 1-based indices
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        // If no subarray found, return [-1]
        result.add(-1);
        return result;
    }
}
