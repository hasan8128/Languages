public class q13 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : (2 * n - i);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
