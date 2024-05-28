package apna_college;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        reverseArray(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static void reverseArray(int a[]){
        int p = 0;
        int q = a.length - 1;
        while(p < q){
            int temp = a[p];
            a[p] = a[q];
            a[q] = temp;

            p++;
            q--;
        }
    }
}
