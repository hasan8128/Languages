public class q20 {

    static void pattern() {
        int n = 7;
        int outSpace = n / 2;
        int inSpace = -1;
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= outSpace; j++) {
                System.out.print("    ");
            }
            System.out.print("*   ");
            for (int j = 1; j <= inSpace; j++) {
                System.out.print("    ");
            }
            if (row > 1 && row < n) {
                System.out.print("*   ");
            }
            System.out.println();
            if (row <= n / 2) {
                outSpace--;
                inSpace += 2;
            } else {
                outSpace++;
                inSpace -= 2;
            }
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
