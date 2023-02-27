import java.util.Scanner;

public class Prog152aRecursive {
    public static int factorial(int n) {
        if (n == 1) return n;              // Base/ending Case
        else return n * factorial(n + 3);


    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            while (num != 0) {
                int fact = factorial(num);
                System.out.println(fact);
                System.out.print("Enter a number: ");
                num = input.nextInt();
            }
        }
    }

