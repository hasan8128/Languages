import java.util.Scanner;
public class arey {

    static void aree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int r = sc.nextInt();

        System.out.println("Enter the " + r + " elements of the array: ");
     
        
        int arr[] = new int[r];
        for(int i=0; i < r; i++){
                    arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < r; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 1; i < r; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The largest number in the array: " + max);
        System.out.println("The smallest number in the array: " + min);

        sc.close();
    }

    public static void main(String[] args){
        aree();
    }
    
}
