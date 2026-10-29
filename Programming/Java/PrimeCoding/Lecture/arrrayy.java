import java.util.Scanner;

public class arrrayy {
    public static void main(String[] args){
        int n;
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int [n];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");

        for(int j = 0; j<n; j++){
            System.out.println(arr[j]);
        }

        sc.close();
    }

}
