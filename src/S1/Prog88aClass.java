package S1;// Michael Verdin
// S1.Prog88aClass
import S1.Cl88a;

import java.util.*;
public class Prog88aClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);




        System.out.print("Enter the first num 1-13: ");
        int  dig1 = input.nextInt();

        System.out.print("Enter a number 2-20: ");
        int dig2 = input.nextInt();
        System.out.println();

        Cl88a wow = new Cl88a(dig1,dig2);
        System.out.println("The original numbers are " + dig1 + " and " + dig2);

        wow.setStuff();

        int num1 = wow.getSum();
        int num2 = wow.getDiff();
        int num3 = wow.getProd();
        int num4 = wow.getAvg();
        int num5 = wow.getAbb();
        int num6 = wow.getmax();
        int num7 = wow.getmin();




        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}

/*
Enter the first num 1-13: 13
Enter a number 2-20: 20

The original numbers are 13 and 20
33
-7
260
16
7
20
13

Process finished with exit code 0

 */