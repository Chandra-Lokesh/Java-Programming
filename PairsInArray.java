package apna_college;

public class PairsInArray {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10};
        int tp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }
}
