public class charPattern {
    public static void main(String[] args) {
        char ch = 'A';
        int line = 4;

        for (int i=1; i<=line; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
