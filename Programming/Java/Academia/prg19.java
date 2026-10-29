class Parent{
    int x;
}

class child extends Parent{
    int x = 20;

    void display(){
        System.out.println("child x = " + x);
        System.out.println("Parent x = " + super.x);
    }
}
class prg19{
    public static void main(String[] args){
        child obj_c = new child();
        obj_c.display();
    }
}