import java.util.Scanner;

public class c2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the " + a + " elements of the array: ");
        
        for(int i = 0; i < a ; i++ ){
            arr[i] = sc.nextInt();
        }
        
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < a; i++){
                    if( arr[i] > largest){
                       second_largest = largest;
                       largest = arr[i];
                       }
                    else if (arr[i] != largest && arr[i] > second_largest) {
                        second_largest = arr[i];
                       }

                    
                } 



        System.out.println("The second largest number : " + second_largest);
        sc.close();
    }
    
}
