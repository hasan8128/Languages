public class q21 {

    static void pattern() {
        int n = 5;
        int star = 1;
        int space = 2 * n - 3;
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*   ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("    ");
            }
            int c = (row == n) ? 1 : 0;
            for (int j = 1; j <= star - c; j++) {
                System.out.print("*   ");
            }
            System.out.println();
            star++;
            space -= 2;
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
