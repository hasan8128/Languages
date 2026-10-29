

class SimpleInterest{
    int Amount, time;
    double rate;
    int Interest_Amount;
    SimpleInterest(){
        Amount = 10000;
        rate = 9.5;
        time = 7;

    }

    void calculateInterest(){
        Interest_Amount = (int) ((Amount * rate * time) / 100) ;
    }

    void display(){
        System.out.println("The simple interest value : " + Interest_Amount);

    }


}

public class p3{
    public static void main(String[] args){
        SimpleInterest obj = new SimpleInterest();
        obj.calculateInterest();
        obj.display();
    }
}