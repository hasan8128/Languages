public class returntype {

    static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args){
        int a =5;
        int b = 6;
        
        int c = sum(a,b);
        System.out.println(c);
    }
    
}
