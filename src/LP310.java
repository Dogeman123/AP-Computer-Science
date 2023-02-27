//Michael Verdin
//LP3-10
import S1.CllP310;

import java.util.*;
public class LP310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers of burgers: ");
        int Burgs = input.nextInt();

        System.out.println("Enter the number of fires: ");
        int fires = input.nextInt();

        System.out.println("Enter the number of sodas: ");
        int sodas = input.nextInt();

        System.out.println("Enter the tax: ");
        double tax = input.nextDouble();

        System.out.println("Enter the amount tendered: ");
        double ten = input.nextDouble();



        CllP310 wow = new CllP310(Burgs, fires, sodas ,tax, ten);
        wow.setStuff();

        double tots = wow.getTotal();
        double wtax = wow.getFinal();
    double change = wow.getChange();
        System.out.println("The total before tax was: " + tots  );

        System.out.println("The total with tax is: " + wtax );

        System.out.println("Amount tendered: " + ten);

        System.out.println("The change is " + change);
    }
}
