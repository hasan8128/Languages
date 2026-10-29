public class q19 {

    static void pattern() {
        int n = 7;
        int star = n / 2 + 1;
        int space = -1;
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*   ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("    ");
            }
            int c = (row == 1 || row == n) ? 1 : 0;
            for (int j = 1; j <= star - c; j++) {
                System.out.print("*   ");
            }
            System.out.println();
            if (row <= n / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
