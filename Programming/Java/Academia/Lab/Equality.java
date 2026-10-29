package Lab;
import java.util.Scanner;

class Equality{
    public static void main(String[] args){
        int a, b;

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = SC.nextInt();
        System.out.println("Enter the second number: ");
        b = SC.nextInt();
        SC.close();

        if(a==b){
            System.out.println("The two numbers are equal");

        }
        else{System.out.println("The two numbers are not equal");

        }
    }
}

