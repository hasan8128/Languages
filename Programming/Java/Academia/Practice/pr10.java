import java.util.Scanner;


class pr10{
    public static void main(String[] args){
        try{
            double rate;
            double principal;
            int time;
            double simple_interest;
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter the principal amount: ");
            principal = SC.nextDouble();
            System.out.println("Enter the rate: ");
            rate = SC.nextDouble();
            System.out.println("Enter the duration: ");
            time = SC.nextInt();
            SC.close();

            if (time == 0) {
                throw new ArithmeticException(); // ← triggers catch
            }
            simple_interest = (principal * rate * time)/ 100 ;
            System.out.println("The interest on the principal: " + simple_interest);
        }
        catch (ArithmeticException e) { 
            System.out.println("Cannot divide by zero"); 
        }

    }
}