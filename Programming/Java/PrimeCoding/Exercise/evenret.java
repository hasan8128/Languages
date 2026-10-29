public class evenret {

    static String check(int n) {
        if (n % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 7;
        String res = check(n);
        System.out.println(res);
    }
}
