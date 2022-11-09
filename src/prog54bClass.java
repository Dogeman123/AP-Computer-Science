import java.util.Scanner;

//Michael Verdin
// Prog54bClass
public class prog54bClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in a number: ");
        int num = input.nextInt();

        System.out.print("Enter in a number: ");
        int num2 = input.nextInt();

        System.out.print("Enter in a number: ");
        int num3 = input.nextInt();

        System.out.print("Enter in a number: ");
        int num4 = input.nextInt();

        Cl54b wow = new Cl54b(num,num2,num3,num4);

        wow.setStuff();

        int num1 = wow.getSum();

        double av = wow.getAverage();

        System.out.print("The sum of the numbers is: " + num1);
        System.out.print("The average of the number is: " + av);




    }
}
