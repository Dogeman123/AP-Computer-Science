package S1;// Prog152a
//Michael Verdin
import java.util.Scanner;

public class Prog152aRecursive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
int sum = 0;
        while (num <= 9669){
            num += 3;
            sum += num;
        }



        System.out.print("The sum of the multiples " + num + " to " + " 9669 is: " + sum);

    }
}
