

class rectangle{

    int l, b;
    int Area;
    rectangle(){
        l = 10;
        b = 25;
    }

    void area(){
       Area = l * b;
    }

    void display(){
        System.out.println("The area of the rectangle: "+ Area );
    }
}

public class p2{
    public static void main(String[] args){
        rectangle obj = new rectangle();
        obj.area();
        obj.display();
    }
}