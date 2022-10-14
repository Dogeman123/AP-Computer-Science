// Michael Verdin
// 10/10/22
// LP5-14
import java.util.*;
public class LP514 {
    public static void main(String[] args){



        Random Dice = new Random();
        int dice = Dice.nextInt(0, 6);

        int num = 0;

        while(num<5){
            num+=1;
            System.out.println(dice);
        }
    }

}
