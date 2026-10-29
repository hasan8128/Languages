class Parent
{
    void display()
    {
        System.out.println("I am Parent class");
    }
}

class child extends Parent
{
    void display()
    {
        System.out.println("I am child class");
    }

    void show() 
    {
        display();
        super.display();
    }
}

class prg20
{
    public static void main(String[] args)
    {
        child _01 = new child();
        _01.show();

    }
}

