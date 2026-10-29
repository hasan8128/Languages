import java.util.Scanner;
public class q7 {
    
    static void triple(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The total number of rows: ");
        int k = sc.nextInt();

        for(int i = 0; i< k ; i++ ){
            for(int j =0; j < k; j++ ){
                if(i==0||j==0||i==k-1||j==k-1){
                    System.out.print( "*");
                }else{
                    System.out.print(" ");
                }   
            }
            System.out.println(" ");
        }
        sc.close();
        }

        public static void main(String[] args){
            triple();
    }
}
