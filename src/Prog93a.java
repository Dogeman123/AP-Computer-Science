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

        double Base = Math.round( KWH * .475);

        System.out.println("Base Rate " + KWH + " @$ " + "0.0475" + "$ " + Base );

        double Sure = Math.round(KWH* 0.0475);
        System.out.println("Surcharge " + Sure);

        double City = Math.round(KWH * 0.001475);
        System.out.println("Citytax "+ "$" + City);


       // System.out.println("Pay this amount" +);






    }
}
