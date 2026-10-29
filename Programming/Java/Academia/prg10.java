import java.util.Scanner;

class prg10
{
    public static void main (String[] args)
    {
        int a;
        Scanner FM = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = FM.nextInt();
        if (a >= 18)
        {
            System.out.println("You are eligible to vote");

        }
        else{
            System.out.println("You are not eligible to vote");
        }
        FM.close();
    }
    
}