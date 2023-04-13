package S1;//Michael Verdin
//S1.Prog910b

import java.util.Scanner;


public class Prog910b {

    public void bconverse(int n, int base) {
        while(n % 10 != 0){
            n = n % base;

        }

    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number base 10 to convert: ");
        int num = input.nextInt();

        System.out.println("Enter the new base: ");
        int base = input.nextInt();



        System.out.println("The number " + num + " [Base 10] " + " = " + "" + "[base " + base + "]");
    }
}
