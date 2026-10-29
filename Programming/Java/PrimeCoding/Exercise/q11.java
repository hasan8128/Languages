
public class q11 {

    static void pattern() {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }

            // Print stars with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print("*       ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
