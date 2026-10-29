import java.util.Scanner;

class AddNumbers{
    int num1, num2, sum;

    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();
        sc.close();
    
    }

    void calculateSum(){
        sum = num1 + num2;
    }

    void display(){
        System.out.println("Sum = " + sum);
    }

}

public class prg13 {
    public static void main(String[] args){
        AddNumbers obj = new AddNumbers();
        obj.getInput();
        obj.calculateSum();
        obj.display();
    }
}




