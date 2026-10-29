public class Exception1{
    public static void main(String[] args){
        try { int a = 10/0;}
        catch (ArithmeticException e)
        {
            System.out.println("Divided by Zero encountered");
        }
        finally{
            System.out.println("Continue with program");
        }
    }
}