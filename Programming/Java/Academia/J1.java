import java.util.Scanner;

public class J1{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of Matrix 1: ");
        int r1 = SC.nextInt();
        int c1 = SC.nextInt();

        System.out.println("Enter the number of rows and columns of Matrix 2: ");
        int r2 = SC.nextInt();
        int c2 = SC.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter the elements of matrix 1: ");
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                A[i][j] = SC.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix 2: ");
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1; j++){
                B[i][j] = SC.nextInt();
            }
        }


        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    C[i][j] = A[i][k]*B[k][j];
                }
            }
        }

        System.out.print("Product of the matrices:");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(C[i][j] + " ");
            }
        }
        SC.close();
    }

}