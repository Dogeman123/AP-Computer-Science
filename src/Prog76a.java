import java.util.*;

// Michael Verdin
//Prog76a
// 9/21/22

 class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Please enter a number you don't like 1-9 ");

        double num = Keyboard.nextDouble();
        double multi = 9;
        double prod = num * multi;
        double anws = prod * 12345679;


        System.out.println(num);
        System.out.println("x" + multi);
        System.out.println("-------------- ");
        System.out.println(prod);
        System.out.println("x" + "12345679");
        System.out.println("-------------- ");
        System.out.println(anws + " Suprise!!! " );

        /*
        Please enter a number you don't like 1-9
5
5.0
x9.0
--------------
45.0
x12345679
--------------
5.55555555E8 Suprise!!!

         */




    }
}