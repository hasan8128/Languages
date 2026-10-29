public class q33 {

    static void pattern() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            for (int j = n - i + 1; j < n; j++) {
                System.out.print(j + "   ");
            }
            System.out.print("0   ");
            for (int j = n - 1; j >= n - i + 1; j--) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
