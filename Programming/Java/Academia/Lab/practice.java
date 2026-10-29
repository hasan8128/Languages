package Lab;
import java.util.Scanner;

class A {
    int a, b;
    int sum;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter the sexond number: ");
        b = sc.nextInt();
        sc.close();
    }

    void Add(){
        sum = a + b;

    }

    void display(){
        System.out.println("The sum of a and b : " + sum );

    }

}

public class practice{
    public static void main(String[] args){
        A obj = new A();
        obj.accept();
        obj.Add();
        obj.display();

    }
}