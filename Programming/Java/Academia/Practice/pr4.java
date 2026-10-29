class Product{
    String name;
    double price;
    int quantity;
    double cost;

    Product(){
        name = " ";
        price = 0;
        quantity = 0;
    }

    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    void cost(){
        cost = price * quantity;
    }

    void display(){
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total Cost: " + cost);
    }
}

public class pr4{
        public static void main(String[] args){
            Product obj = new Product("Biscuit",5.0, 3);
            Product obj1 = new Product("chocolate", 10.0, 4);
            obj.cost();
            obj1.cost();
            obj.display();
            obj1.display();
        }
    }