
public class q10 {

    static void pattern() {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }

            // Print stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
