package apna_college;

public class BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int a[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int minIndex = getMinNumber(a);
        int tarIndex;
        if(a[minIndex] <= target && target <= a[a.length - 1])
            tarIndex = BinarySearch.binarySearch(a, target, minIndex, a.length - 1);
        else
            tarIndex = BinarySearch.binarySearch(a, target, 0, minIndex - 1);
        System.out.println("Target is at Index: " + tarIndex);
    }
    static int getMinNumber(int a[]) {
        int start = 0;
        int end = a.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(a[mid] < a[mid - 1])
                return mid;
            else if(a[start] < a[mid] && a[mid] > a[end])
                start = mid + 1;
            else if(a[mid] < a[start] || a[mid] < a[end])
                end = mid - 1;
        }
        return start;
    }
}