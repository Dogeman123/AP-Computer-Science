package S1;

import java.util.*;

public class Prog54b {

    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter a 3 digit number ");
        double First = Keyboard.nextDouble();

        System.out.print("Enter a 3 digit number ");
        double Second = Keyboard.nextDouble();

        System.out.print("Enter a 3 digit number ");
        double third = Keyboard.nextDouble();

        System.out.print("Enter a 3 digit number ");
        double Fourth = Keyboard.nextDouble();

        double sum = First + Second + third + Fourth;
        System.out.println("The sum of the three numbers is " + sum);

        double Average = sum/4;

        System.out.println("The Average of the four number is " + Average);















    }
}
