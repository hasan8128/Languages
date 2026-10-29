package Lab;
import java.util.Scanner;

class func{
    int n;
    int arr[];
    int max ;
    int min ;
    


    void array(){
        Scanner SC = new Scanner(System.in);
        System.out.println("How many numbers to compare?");
        n = SC.nextInt();
        System.out.println("What are the " + n +" numbers?");
        arr = new int[n];
        for(int i=0; i < n; i++ ){
             arr[i] = SC.nextInt();
        }

        SC.close();

        max = arr[0];
        min = arr[0];
        
    }

    void compare(){
        

        for(int i = 0; i < n; i++){
            if (arr[i]> max){
                max = arr[i];
            }
            if(arr[i] < min ){
                min = arr[i];
            }
        }

    }

    void display(){
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }

}



public class maxmin {
    public static void main(String[] args){
        func obj = new func();
        obj.array();
        obj.compare();
        obj.display();

    }
    
}
