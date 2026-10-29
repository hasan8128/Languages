package Lab;
import java.util.Scanner;

class VoterAge{
    public static void main(String[] args){
        int age;
        System.out.println("What is your age: ");
        Scanner SC = new Scanner(System.in);
        age = SC.nextInt();
        SC.close();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

    }
}
