package S1;// Michael Verdin
//S1.Prog65h
import java.util.*;
public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        int pound = input.nextInt();

        System.out.print("Enter shillings: ");
        int shill = input.nextInt();

        System.out.print("Enter Pence: ");
        int pence = input.nextInt();

        int con = shill % pence;

        System.out.print("Decimal pounds = " + pound + "." + con + pence);



    }
}

/*
Enter pounds: 7
Enter shillings: 17
Enter Pence: 9
Decimal pounds = 7.89
 */