public class q25 {

    static void pattern() {
        int n = 5;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
