import java.util.Scanner;

class prg9
{
    public static void main (String[] args)
    {
        int a;
        Scanner O1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = O1.nextInt();
        if (a % 2 == 0)
        {
            System.out.println("The number is even");

        }
        else 
        {
            System.out.println("The number is odd");
        }
        O1.close();

    }

}