package apna_college;

public class MaxSubArraySum_PrefixSum {
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        System.out.println("\nMaximum Sum of Subarray is: " + maxSubArraySum(numbers));
    }

    static int maxSubArraySum(int a[]){
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i-1] + a[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                if(i == 0)
                    sum = prefix[j];
                else
                    sum = prefix[j] - prefix[i-1];
                System.out.print(sum + " ");
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
