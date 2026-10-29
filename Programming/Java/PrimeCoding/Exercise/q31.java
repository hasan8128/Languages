public class q31 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*   ");
                } else {
                    System.out.print(j + "   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
