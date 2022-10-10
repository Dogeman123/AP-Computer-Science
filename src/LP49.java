// Michael Verdin
// LP4-9
// 10/4/22
 import java.util.*;
 import java.util.random.RandomGenerator;
 import java.util.random.RandomGenerator.*;
public class LP49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 20: ");
        int Pnum = input.nextInt();

        Random Compnum = new Random();
            int num = Compnum.nextInt(20);
            System.out.print("Computer's Number: " + num);

        if (Pnum == num){
            System.out.print("You win");
        }else{
            System.out.println("Better luck next time"  );
        }

    }
    }


/*
Enter a number between 1 and 20: 15
Comput1er's Number: 14
Better luck next time

 */