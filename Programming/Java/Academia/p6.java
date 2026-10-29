
class student{
    String Name;
    int rollNo ;

    student(String n, int r){
        Name = n;
        rollNo = r; 
    }

    void display(){
        System.out.println("Name : " + Name);
        System.out.println("Roll No: " + rollNo );

    }
}

class Result extends student {
    
    int m1, m2, m3;
    int total;
    double percentage;

    Result(String n, int r, int m1, int m2, int m3) {
        super(n, r);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        total = m1 + m2 + m3;
        percentage = total / 3.0;
    }

    void display() {
        super.display();
        System.out.println("Marks 1    : " + m1);
        System.out.println("Marks 2    : " + m2);
        System.out.println("Marks 3    : " + m3);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
    }
}

class p6 {
    public static void main(String[] args) {
        Result res = new Result("Rahul", 42, 85, 90, 78);
        res.display();
    }
}

