class parent{
    void display(){
        System.out.println("What do you want?");
    }
}

class child extends parent{
    void display(){
        super.display();
        System.out.println("I want a blue car!");
    }
}
class pr8{
    public static void main(String[] args){
        child c = new child();
        c.display();
    }

}