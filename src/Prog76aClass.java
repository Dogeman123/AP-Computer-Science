// Michael Verdin
// Prog76aClass
import java.util.*;
public class Prog76aClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number you dislike: ");
        int num = input.nextInt();

       Cl76a wow = new Cl76a( num);

       wow.setStuff();

       int num2 = wow.getAws();
       System.out.print(num);
       System.out.print("x" + "9");
       System.out.print("---------------");
    }
}
