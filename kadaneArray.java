class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // Extend the current subarray or start a new subarray at current element
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            // Update maxSoFar if maxEndingHere is greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}
