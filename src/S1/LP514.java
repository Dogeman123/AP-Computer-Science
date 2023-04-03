package S1;// Michael Verdin
// 10/10/22
// LP5-14
import java.util.*;
public class LP514 {
    public static void main(String[] args){



        System.out.println("Dice1 " +   "Dice 2 "  + "total");

        int num = 0;
        int total = 0;
        while(num<5){
            num += 1;
            Random Dice = new Random();
            int dice = Dice.nextInt(1, 6);
            Random Dice2 = new Random();
            int dice2 = Dice2.nextInt(1, 6);
            total = dice + dice2;

            System.out.println(dice + "     " + dice2 + "     " +total);
        }
    }

}

/*
Dice1 Dice 2 total
4     4     8
5     3     8
4     4     8
1     5     6
1     3     4
 */