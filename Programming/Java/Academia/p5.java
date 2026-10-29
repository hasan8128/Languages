
class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    int bonus;
    int totalSalary;

    Manager(String n, int s, int b) {
        super(n, s);        
        bonus = b;
        totalSalary = salary + bonus;
    }

    void display() {
        super.display();    
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : " + totalSalary);
    }
}

class p5 {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 50000, 10000);
        m.display();
    }
}
