package apna_college;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int start = 0;
        int end = a.length-1;
        System.out.println("Key is at index: " + binarySearch(a, 5, start, end));
    }
    public static int binarySearch(int a[], int key, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(key == a[mid])
                return mid;
            else if(key < a[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}