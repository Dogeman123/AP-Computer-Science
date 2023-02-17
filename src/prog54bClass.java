import S1.Cl54b;

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

        System.out.println("The sum of the numbers is: " + num1);
        System.out.println("The average of the number is: " + av);

    }
}
/*
Enter in a number: 475
Enter in a number: 821
Enter in a number: 369
Enter in a number: 562
The sum of the numbers is: 2227
The average of the number is: 556.0

Process finished with exit code 0

 */