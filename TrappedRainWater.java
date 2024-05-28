package apna_college;

public class TrappedRainWater {
    public static void main(String[] args) {
        int a[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(getTrappedRainWater(a));
    }
    static int getTrappedRainWater(int a[]){
        int len = a.length;
        int leftMaxBoundary[] = new int[len];
        int rightMaxBoundary[] = new int[len];
        int trappedRainWater[] = new int[len];
        int totalTrappedRainWater = 0;

        leftMaxBoundary[0] = a[0];
        rightMaxBoundary[len - 1] = a[len - 1];

        for (int i = 1; i < len; i++) {
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i-1], a[i]);
        }
        for (int i = len - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(rightMaxBoundary[i+1], a[i]);
        }

        for (int i = 0; i < len; i++) {
            trappedRainWater[i] = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]) - a[i];
            totalTrappedRainWater += trappedRainWater[i];
        }
        return totalTrappedRainWater;
    }
}
