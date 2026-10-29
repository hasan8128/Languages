/* Write a program in java to demonstrate the concept of inheritance, 
use a base class set derived three classes for example circle, rectangle
 and triangle that calculate an display their respective areas?*/

 class Shape{

    double Area;
    void display(){
        System.out.println("Area = " + Area);

    }
 }

 class circle extends Shape{
    double r;
    circle(double r1){
        r = r1;
    }

    void cal(){
        Area = 3.14 * r * r ;
    }
 }

 class rectangle extends Shape{
    double l, b;
    rectangle(double l1, double b1){
        l = l1;
        b = b1;
    }

    void cal(){
        Area = l * b;
    }
 }

 class triangle extends Shape{
    double b, h;
    triangle(double b1, double h1){
        b = b1;
        h = h1;
    }

    void cal(){
        Area = 0.5 * b * h;
    }
 }

 class prg18{
    public static void main(String[] args){
        circle c = new circle(7);
        c.cal();
        System.out.print("Circle    = ");
        c.display();

        rectangle r = new rectangle(5, 4);
        r.cal();
        System.out.print("Rectangle = ");
        r.display();

        triangle t = new triangle(6, 3);
        t.cal();
        System.out.print("Triangle  = ");
        t.display();

    }
 }

