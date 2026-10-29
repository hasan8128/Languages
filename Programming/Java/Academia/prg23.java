import java.util.Scanner;
import java.util.InputMismatchException;

class Exam{
    String name;
    double attendance;

    Exam() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = SC.nextLine();
        System.out.println("Enter your attendance: ");
        attendance = SC.nextDouble();
        SC.close();
    }

    void display() {
        if (attendance >= 75) {
            System.out.println(name + " is eligible for the exam.");
        } else {
            System.out.println(name + " is NOT eligible for the exam.");
        }
    
    }
    
}

public class prg23{
    public static void main (String[] args){
        
        try {
            Exam obj = new Exam();
            obj.display();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: attendance must be a number.");
        } 
        
    }
}