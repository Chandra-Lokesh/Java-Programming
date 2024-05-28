package apna_college;

public class MaxSubArraySum_KadaneAlgo {
    public static void main(String[] args) {
        int numbers[] = {-1, -2, -3, -4 , -5};
        System.out.println("Maximum Sum of Subarray is: " + maxSubArraySum(numbers));
    }

    static int maxSubArraySum(int a[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int largestNumber = getLargestNum(a);
        if(largestNumber < 0)
            return largestNumber;

        for (int i = 0; i < a.length; i++) {
            curSum = curSum + a[i] < 0 ? 0: curSum + a[i];
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
    
    static int getLargestNum(int a[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }
}
