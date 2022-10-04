// Michael Verdin
// LP-4-1
// 10/4/22
import java.util.*;
 public class LP41 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Enter the number of copies to be printed: ");
        double num = imput.nextInt();

        double price = 0;

        if (num <= 99) {
            num = num * .30;

        } else if (num<=499){
           num = num * .28;

        }else if (num<=749) {
            num = num * .27;

        }else if (num<=1000) {
            num = num * .26;
        }else if (num>1000) {
            num = num * .25;

        }

        System.out.println("Price per copy is: " + num);
            System.out.println("total cost is:");

    }
}
