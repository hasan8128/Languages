public class voidy{
    void sum(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void main (String[] args){
        int a = 5;
        int b = 6;

        voidy obj = new voidy();
        obj.sum(a,b);

    }
    
}
