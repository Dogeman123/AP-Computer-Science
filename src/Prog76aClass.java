// Michael Verdin
// Prog76aClass
import java.util.*;
public class Prog76aClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number you dislike: ");
        int num = input.nextInt();

       Cl76a wow = new Cl76a(num);

       wow.setStuff();

       int num1 = wow.getProd();

       int num2 = wow.getAws();

       System.out.println(num);
       System.out.println("x " + "9");
       System.out.println("---------------");
       System.out.println(num1);
       System.out.println("x 123456789");
       System.out.println("----------------");
       System.out.println(num2);
    }
}

/*
Enter a number you dislike: 5
5
x 9
---------------
45
x 123456789
----------------
555555555

 */