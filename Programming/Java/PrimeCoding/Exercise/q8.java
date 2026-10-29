import java.util.Scanner;
public class q8 {
    
    static void triple(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The total number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();

        }
        
        

        public static void main(String[] args){
            triple();
    }
}
