package S1;

import java.util.*;

    public class MSOE3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter d?");
            double d = input.nextDouble();
            System.out.println("Enter  n?");
            double n = input.nextDouble();
            System.out.println("Enter r1?");
            double r1 = input.nextDouble();
            System.out.println("Enter r2?");
            double r2 = input.nextDouble();
            double f = 0;
            f = (n - 1) * ((1 / r1) - (1 / r2) + (((n - 1) * d) / (n * r1 * r2)));
            System.out.println(f);
            f = 1 / f;
            System.out.println(f);
        }
    }

