class Student{
    String name = "Rahul";
}
class course extends Student{
    String course = "BCA";
    void display(){
        System.out.println("The name of the student: " + super.name);
        System.out.println(super.name + " is enrolled in " + course);
    }
}

class pr8{
    public static void main(String[] args){
        course c = new course();
        c.display();
    }
}