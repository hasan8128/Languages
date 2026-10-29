public class q12 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print("*   ");
                } else {
                    System.out.print("!   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
