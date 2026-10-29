public class q14 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = (i <= n) ? (n - i) : (i - n);
            int stars = (i <= n) ? i : (2 * n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("    ");
            }
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
