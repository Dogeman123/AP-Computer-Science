import java.util.*;
// Michael Verdin

// 9/19/22

public class Prog93a {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the KWH ");
        double KWH = keyboard.nextDouble();

        System.out.println("COMP SCI Electric ");

        System.out.println("---------------------");

        System.out.println("Kilowatts used " + KWH);

        System.out.println("---------------------");

        double price = 4.75;

        double Base = Math.round(price* 10 );


        System.out.println("Base Rate " + KWH + " @$ " + "0.0475" + "$ " + Base );

        double Sure = (price);
        System.out.println("Surcharge " + "$" + Sure);

        double City = Math.round(price * .3);
        System.out.println("Citytax "+ "$" + City);


        double total = Base + Sure + City;

        double late = total* .03;
       System.out.println("Pay this amount $ " + total );

       System.out.println("The late fee is $ " + (late + total)  );

    /*
    Enter the KWH 993
COMP SCI Electric
---------------------
Kilowatts used 993.0
---------------------
Base Rate 993.0 @$ 0.0475$ 48.0
Surcharge $4.75
Citytax $1.0
Pay this amount $ 53.75
The late fee is $ 55.3625

Process finished with exit code 0
good
     */




    }
}
