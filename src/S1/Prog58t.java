package S1;

import java.util.*;
//Michael Verdin
// 09/14/22
public class Prog58t {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter the purchase price ");
        double Price = Keyboard.nextDouble();

        System.out.print("Enter the amount received ");
        double reci = Keyboard.nextDouble();



        double change = reci - Price;

        double RT = Math.round(change-2);

        double dollars = Math.round(change-1) ;

        double Quarters = Math.round((change-RT)/.25);

        double Dimes = Math.round((change-RT)/.10);

        double Nickels = Math.round((change-RT/.5));

        double Pennies = Math.round((change-RT)/.1);

        System.out.println("The change due is " + change);

        System.out.println("Dollars " + dollars);

        System.out.println("Quarters " + Quarters);

        System.out.println("Dimes " + Dimes);

        System.out.println("Nickels " + Nickels);

        System.out.println("Pennies " + Pennies);




    }
}
