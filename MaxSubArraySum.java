package apna_college;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        System.out.println("\nMaximum Sum of Subarray is: " + maxSubArraySum(numbers));
    }

    static int maxSubArraySum(int a[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                System.out.print(sum + " ");
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
