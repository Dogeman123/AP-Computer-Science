package S1;// Michael Verdin
// 10/10/22
// LP5-5
import java.util.*;
public class LP55 {
    public static void main(String[] args) {
       Scanner imput = new Scanner(System.in);

       System.out.print("Enter a positive integer: ");
       int num = imput.nextInt();


        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            System.out.println(j);
        }
    }
}

/*
Enter a positive integer: 546
5
4
6
 */