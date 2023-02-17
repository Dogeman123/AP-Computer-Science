package S1;// Michael verdin
// S1.Prog52aClass
// 10/17/22
import S1.Cl52a;

import java.util.Scanner;
public class Prog52aClass {
    // Driver program
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        int len = kbd.nextInt();
        System.out.print("Please enter the width: ");
        int wid = kbd.nextInt();
        System.out.println();

        // Make a new object (instance) of S1.Cl52a (Instantiate the class
        Cl52a wow = new Cl52a(len, wid);

        wow.setStuff();

        int area = wow.getArea();
        int perim = wow.getPerim();

       // System.out.println("Area: " + area);
       // System.out.println("Perim: " + perim);
        System.out.println(wow);
    }
}
