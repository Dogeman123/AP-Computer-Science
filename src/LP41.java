// Michael Verdin
// LP-4-1
// 10/4/22
import java.util.*;
public class LP41 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter the number of copies to be printed: ");
        double num = imput.nextInt();

        double price = 0;

        if (num <= 99) {
            num = num * .30;
            price = .30;
        } else if (num<=499){
            num = num * .28;
            price = .28;
        }else if (num<=749) {
            num = num * .27;
            price = .27;
        }else if (num<=1000) {
            num = num * .26;
        }else if (num>1000) {
            num = num * .25;
            price= .25;
        }

        System.out.println("Price per copy is: " + price);
        System.out.println("total cost is: " + num );

    }
}

/*
Enter the number of copies to be printed: 98
Price per copy is: 0.3
total cost is: 29.4
 */