public class q16 {

    static void pattern() {
        int n = 5;
        int space = 2 * (n - 1);
        int star = n;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*   ");
            }
            System.out.println();
            if (row < n) {
                space -= 2;
                star--;
            } else {
                space += 2;
                star++;
            }
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
