

class Student{
    int Number, Roll_Number, Mark;
    String Name;
    Student(){
        Name = "Rahul" ;
        Number = 1234594889;
        Roll_Number = 78;
        Mark = 97;
    }

    void display(){
        System.out.println("Student: " + Name);
        System.out.println("Contact number: +91 " + Number);
        System.out.println("Roll Number: " + Roll_Number);
        System.out.println("Mark: " + Mark);
    }

}

public class p4{
    public static void main(String[] args){
        Student obj = new Student();
        obj.display();
    }
}