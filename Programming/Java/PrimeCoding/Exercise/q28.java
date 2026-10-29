public class q28 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            int val = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(val + "   ");
                if (j < i) {
                    val++;
                } else {
                    val--;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
