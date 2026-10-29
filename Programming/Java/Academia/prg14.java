class Student{
    int a, b;
    Student(){
        a = 10;
        b = 20;
    }

    void display(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class prg14{
    public static void main(String[] args){
        Student obj = new Student();
        obj.display();
    }
}

