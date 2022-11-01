// Michael Verdin
// Prog58b
import java.util.*;
public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A, B and C: ");
        int A = input.nextInt();

        int B = input.nextInt();

        int C = input.nextInt();

        double root = (-B+Math.sqrt(Math.pow(B,2)-4*A*C)/2*A);

        System.out.print("The roots are: " + root);
    }
}
/*
Enter A, B and C: 1 5 6
The roots are: -2,-3
 */