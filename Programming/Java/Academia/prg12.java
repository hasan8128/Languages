import java.util.Scanner;

class prg12{
    public static void main (String [] args){
        Scanner SC = new Scanner(System.in);
        int i;
        int[] arr = new int[6];
        int sum = 0;

        System.out.println("Enter the five numbers: ");
        for( i = 0; i < 5; i++){
            arr[i] = SC.nextInt();
            sum += arr[i];

        }

        arr[5] = sum;

        System.out.println("The sum of the array: " + arr[5]);
        System.out.println("The content of the array: ");
        for(i = 0; i < 5; i++){
            System.out.println("arr[" + i + "]= " + arr[i]);
        }

        SC.close();
    }


}
