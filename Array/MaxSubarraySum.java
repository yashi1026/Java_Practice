public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;
        for (int i : arr) {
            currentSum += i; 
            if (currentSum > maxSum) {
                maxSum = currentSum; 
            }
            
            if (currentSum < 0) {
                currentSum = 0; 
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}

