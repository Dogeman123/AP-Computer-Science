// Michael Verdin
//LP4-16
//10/7/22
import java.util.*;

import java.lang.Math.*;
class LP416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angles in degrees: ");
        double degree = input.nextDouble();

        degree = Math.toRadians(degree);


        System.out.println("Sin: " + Math.sin(degree));

        System.out.println("Cos: " + Math.cos(degree));

        System.out.println("Tan: " + Math.tan(degree));

    }
}

/*
Enter an angles in degrees: 30
Sin: 0.499
Cos: 0.866
Tan: 0.577
 */