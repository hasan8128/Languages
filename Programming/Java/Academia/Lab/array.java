package Lab;
import java.util.Scanner;

class arey{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the number for a: ");
        int a = SC.nextInt();
        System.out.println("Enter the number for b: ");
        int b = SC.nextInt();
        int arr[] = new int [9];
        int i, sum = 0;

        System.out.println("Enter the five numbers: ");
        for(i=0; i<5; i++){
            System.out.println("Enter number " + (i +1) + ": ");
            arr[i] = SC.nextInt();
            sum += arr[i];
        }

        arr[5] = sum;
        arr[6] = a;
        arr[7] = b;
        arr[8] = sum + a + b;

        System.out.println("The numbers stored in array are: ");
        for(i = 0; i < 5; i++){
            System.out.println("arr[" + i + "]: " + arr[i]);

        }

        System.out.println("The sum of five numbers in input: " + arr[5]);
        System.out.println("The sum of all numbers in array: " + arr[8]);

        SC.close();
    }
}