package S1;// Michael Verdin
// 10/7/22
// LP4-3
import java.util.*;
public class LP43 {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of eggs produced: ");
        double eggs = input.nextInt();

        double price = 0;

        if (eggs < 48) {
            eggs = eggs * .50;
            price = .50;
        } else if (eggs < 72){
            eggs = eggs * .45;
            price = .45;
        }else if (eggs < 132) {
            eggs = eggs * .40;
            price = .40;
        }else if (eggs <= 132) {
            eggs = eggs * .35;
            price = .35;



    }

        double bill = price;

        System.out.print("The bill is equal to: " + eggs);
    }
}
