/*Polymorphism is of two types and they are static which allows overloading add()

void add();
void add(int a, int b);
void add(int a, int b, int c);

and the second is dynamic which allows overriding

sub classes can inherit from parent class where every sub class has different properties

*/ 

/*Polymorphism means many forms. It allows one method name to perform different behaviours depending on the context.

types of polymorphism: 
1) compile time polymorphism(Static polymorphism): 
-overloading( decision is made at the compile time)
2)Run time polymorphism (dynamic polymorphism): 
-method overriding ( decision made at the run time)
*/


// Constructor overloading parameterized
class A{
    int a, b;
    A(int x, int y){
        a = x;
        b =y;
    }

    void display(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class prg15{
    public static void main(String[] args){
        A obj = new A(10, 20);
        obj.display();
    }
}