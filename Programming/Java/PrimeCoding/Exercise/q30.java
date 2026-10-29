public class q30 {

    static void pattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
