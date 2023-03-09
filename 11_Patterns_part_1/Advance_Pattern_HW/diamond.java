// package Advance_Pattern_HW;

public class diamond {
    public static void main(String[] args) {
        int n = 5;
        //upper half
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
