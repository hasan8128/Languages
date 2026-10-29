import java.util.Scanner;
 
class prg11{
    public static void main(String[] args)
    {
        int a, b, c;
        double discriminant, root1, root2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b and c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root 1 = Root 2 = " + root1);
        } else {
            System.out.println("Roots are complex and different.");
        }
        sc.close();

    }
}