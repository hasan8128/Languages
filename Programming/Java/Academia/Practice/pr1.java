import java.util.Scanner;

class Account{
    int account_number;
    String account_holder_name ;
    double balance;
    double amount;
    String Input;
    String Option;
    String Choice;
    void display(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter account number: ");
        account_number = SC.nextInt();
        SC.nextLine();
        if(String.valueOf(account_number).length() != 7){
            System.out.println("Account number must be 7 digits");
        }
        else{
            System.out.println("Enter the account holder name: ");
            account_holder_name = SC.nextLine();
            while(true){

                System.out.println("Enter (D) for Deposit, (W) for Withdrawl and (B)");
                Input = SC.nextLine();

                if ( Input.equals("D")){
                    System.out.println("Enter the amount for deposit: ");
                    balance = SC.nextDouble();
                    SC.nextLine();
                    System.out.println("The deposit of amount " + balance + " is succesful");
                }

                else if(Input.equals("W")){
                    System.out.println("Enter the amount for withdrawl: ");
                    amount = SC.nextDouble();
                    SC.nextLine();
                    if (amount > 0 && amount < balance){
                        System.out.println("The withdrawl of amount " + amount + " is succesful");
                        balance = balance - amount;
                    }
                    else{
                    System.out.println("The balance is insufficient for withrawl");
                }
                }
            
                else if(Input.equals("B")){
            
                    System.out.println("The balance of the account: " + balance);
            
                }
            
                else{
            
                    System.out.println("The input is invalid for any operation");
            
                }

                System.out.println("Press (Y) to continue and (Q) to quit");
                Option = SC.nextLine();
                if(Option.equals("Q")){
                    break;
                }
                else if(Option.equals("Y")){
                    continue;
                }
                else{
                    System.out.println("Enter valid option");
                    System.out.println("Press (Y) to continue and (Q) to quit");
                Option = SC.nextLine();

                }
                SC.close();
            }
        }

    }
    
    


}

public class pr1{
    public static void main (String[] args){
        Account obj = new Account();
        obj.display();
    }
}
