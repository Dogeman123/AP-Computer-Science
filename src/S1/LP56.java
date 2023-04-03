package S1;// Michael Verdin
// 10/17/22
// LP5-6
import java.util.*;
public class LP56 {
    public static void main(String[] args){
      Scanner imput = new Scanner(System.in);

      System.out.print("Enter a positive integer: ");
      int num = imput.nextInt();


        int sum = 0;
        while (num > 0) {
        sum = sum + num % 10;
        num = num / 10;
    }
        System.out.println("The sum of digits is: " + sum);
}
}

/*
Enter a positive integer: 892
The sum of digits is: 19
 */