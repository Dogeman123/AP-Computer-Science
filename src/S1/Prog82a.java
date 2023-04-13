package S1;

import java.util.*;
//Michael Verdin
// 09/15/22
public class Prog82a {
    public static void main(String[] args) {
            Scanner Keyboard = new Scanner(System.in);

            System.out.print("Enter the speed limit ");
            double speed = Keyboard.nextDouble();

            System.out.print("Enter the vehicle speed ");
            double Vspeed = Keyboard.nextDouble();

            double charge = (Vspeed - speed);

            double Fine = (charge*5)+20;

            System.out.println("The fine is " + Fine);



            /*
            public class S1.Prog82a {
    public static void main(String[] args) {
            Scanner Keyboard = new Scanner(System.in);

            System.out.print("Enter the speed limit ");
            double speed = Keyboard.nextDouble();

            System.out.print("Enter the vehicle speed ");
            double Vspeed = Keyboard.nextDouble();

            double charge = (Vspeed - speed);

            double Fine = (charge*5)+20;

            System.out.println("The fine is " + Fine);

            good




             */

        }
    }

