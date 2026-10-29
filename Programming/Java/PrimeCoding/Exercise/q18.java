public class q18 {

    static void pattern() {
        int n = 7;
        int space = n / 2;
        int star = 1;
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*   ");
            }
            System.out.println();
            if (row <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
