import java.util.Scanner;

class pr11{
    public static void main(String[] args){
        int[] Marks = {80, 89, 87, 86, 76};

        try{
            Scanner SC = new Scanner(System.in);
            System.out.println("Enter the index: ");
            int index = SC.nextInt();
            System.out.println("The mark on the index: " + Marks[index]);
            SC.close();
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index is invalid");

        }
    }
}