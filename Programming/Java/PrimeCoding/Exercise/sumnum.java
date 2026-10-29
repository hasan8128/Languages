public class sumnum {

    static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int n = 10;
        int res = sum(n);
        System.out.println(res);
    }
}
