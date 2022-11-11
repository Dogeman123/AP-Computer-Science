// Michael Verdin
// 10/10/22
// LP4-6
import java.util.*;
public class LP46 {
    public static void main(String[] args) {
       Random rand = new Random();
       int upperbound = 11 ;
       int num1 = rand.nextInt(upperbound);
       int num2 = rand.nextInt(upperbound);
       int value = 0;
       char Operator = ('?');

       switch (rand.nextInt(4)){
           case 0: Operator = '+';
           value = num1+num2;
           break;

           case 1: Operator = '-';
           value = num1-num2;
           break;

           case 2: Operator = '/';
           value = num1/num2;

           case 3: Operator = '*';
           value = num1*num2;
           break;
           default: Operator = '?';

       }

       System.out.println(num1 + " " + Operator + " " + num2 + " = " + value);

    }
}

/*
9 * 3 = 27
 */