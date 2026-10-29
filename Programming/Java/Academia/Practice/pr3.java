class Employee{
    String name;
    int salary;

    Employee(String x, int y){
        name = x;
        salary = y;
    }

    void display(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}

class pr3{
    public static void main(String[] args){
        Employee obj1 = new Employee("Rahul", 70000);
        Employee obj2 = new Employee("Hasan", 55000);
        Employee obj3 = new Employee("Riya",  72000);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}