package S1;// Michael Verdin
//LP-3-9
import S1.CllP9;

import java.util.*;
public class LP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Birth year: ");
        int Byear = input.nextInt();

        System.out.print("Enter your Birth month: ");
        int Bmonth = input.nextInt();

        System.out.print("Enter the day your were born in: ");
        int Bday = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the month: ");
        int month = input.nextInt();

        System.out.print("Enter the day its now: ");
        int day = input.nextInt();

        CllP9 wow = new CllP9(Byear, Bmonth, Bday, year, month, day);

        wow.setStuff();

        int alive = wow.getAlive();

        int sleep = wow.getSleep();

        System.out.println("You have been alive for " + alive + " days. ");
        System.out.println("You have slept for " + sleep + " Hours. ");

    }
}

  /*  Enter your Birth year: 1997
        Enter your Birth month: 2
        Enter the day your were born in: 12
        Enter the year: 2012
        Enter the month: 8
        Enter the day its now: 3
        You have been alive for 5646 days.
        You have slept for 45168 Hours.

   */