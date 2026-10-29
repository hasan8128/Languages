public class q22 {

    static void pattern() {
        int n = 5;
        int star = n;
        int space = -1;
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*   ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("    ");
            }
            int c = (row == 1) ? 1 : 0;
            for (int j = 1; j <= star - c; j++) {
                System.out.print("*   ");
            }
            System.out.println();
            star--;
            space += 2;
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
