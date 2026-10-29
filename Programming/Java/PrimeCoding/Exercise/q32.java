public class q32 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int val = (i <= n) ? i : (2 * n - i);
            for (int j = 1; j <= 2 * val - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print(val + "   ");
                } else {
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
