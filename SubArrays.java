package apna_college;

public class SubArrays {
    public static void main(String[] args) {
        
        int a[] = {2, 4, 6, 8, 10};
        int ts = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]+" ");
                }
                System.out.print(")");
                ts++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Subarrays: " + ts);
    }
}
