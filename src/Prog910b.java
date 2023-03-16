//Michael Verdin
//Prog910b

import java.util.Scanner;

public class Prog910b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number base 10 to convert: ");
        int num = input.nextInt();

        System.out.println("Enter the new base: ");
        int base = input.nextInt();

        double r1 = num / 10.0;

        System.out.println("test: " + r1);


    }
}
