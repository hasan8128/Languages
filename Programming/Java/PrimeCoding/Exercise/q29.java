public class q29 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            System.out.print(i + "   ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("0   ");
            }
            if (i > 1) {
                System.out.print(i + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
