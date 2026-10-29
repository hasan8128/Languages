import java.util.Scanner;

class prg7
{
    public static void main (String[] args)
    {
        int a, b;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = SC.nextInt();
        System.out.println("Entr b: ");
        b = SC.nextInt();
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction =" + (a - b));
        System.out.println("Multiplication = "+ (a * b));
        System.out.println("Division = "+ (a /b ));

        SC.close();

    }
}