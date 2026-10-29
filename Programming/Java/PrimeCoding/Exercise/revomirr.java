import java.util.Scanner;
public class revomirr {
    
    static void triple(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The number of spaces in the first row: ");

        int space = sc.nextInt();

        System.out.println("The number of stars in the first row: ");
        int star = sc.nextInt();

        System.out.println("The total number of rows: ");
        int k = sc.nextInt();

        int z = k/2;

       for(int i = 0; i< k ; i++ ){
            for(int j =0; j <star; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j<space;j++){
                System.out.print("*");
            }
            System.out.println("");
            if( i < z ){
                space --;
                star ++;
            }else{
                space ++;
                star --;
            }  
            
        }
        sc.close();
        }

        public static void main(String[] args){
            triple();
    }
}
