// Michael Verdin
// Prog 82aClass
import S1.Cl82a;

import java.util.*;
public class Prog82aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int speed = input.nextInt();

        Cl82a wow = new Cl82a(limit,speed);

        wow.setStuff();

        double num4 = wow.getFee();

        System.out.print("The fee is " + "$" + num4);

    }
}

/*
Enter the speed limit: 30
Enter the vehicle speed: 42
The fee is $80.0
 */