    
class company{
    final String Company_name = "Blue Whale";

    final void display()
    {
    System.out.println("Blue Whale");
    }

    void Method1(){
        System.out.println("The company name is: " + Company_name);
    }

    void Method2(){
        System.out.println("Rahul is an employee of " + Company_name + "company");
    }
    void Method3(){
        String message = "Welcome to the " + Company_name + " company";
        System.out.println(message);
    }
} 
    

class prg21{
    public static void main(String[] args){
        company obj = new company();
        obj.display();
        obj.Method1();
        obj.Method2();
        obj.Method3();
        
    }
}