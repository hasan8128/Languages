import java.util.Scanner;

class Student{
    int student_id;
    String student_name;
    String course;
    Scanner SC = new Scanner(System.in);

    void display(){
        System.out.println("The ID of the student: " + student_id );
        System.out.println("The name of the student: " + student_name);
        System.out.println("The course enrolled by the student: " + course);

    }

    void update(){
        System.out.println("Enter the Student ID: ");
        student_id = SC.nextInt();
        SC.nextLine();
        System.out.println("Enter the student name: ");
        student_name = SC.nextLine();
        System.out.println("Enter the course: ");
        course = SC.nextLine();

    }

    void check(){

        if(course.equals("BCA")){
            System.out.println("The student is successfully enrolled in the BCA course");
        }
        else if(course.equals("BBA")){
            System.out.println("The student is successfully enrolled in the BBA course");
        }
        else{
            System.out.println("The search has no matched result");
        }

    }

}

public class pr2{
    public static void main(String[] args){
        Student obj = new Student();
        Student obj1 = new Student();
        obj.update();
        obj.display();
        obj.check();
        obj1.update();
        obj1.display();
        obj1.check();
    }
    
}