// Michael Verdin
// Prog72t
import java.util.*;
public class Prog72t {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter the first time: ");
        int Time1 = imput.nextInt();
        System.out.print("Enter the second time: ");
        int Time2 = imput.nextInt();

        int time = Time2 % Time1;
        System.out.print(time + "hours");


    }
}
/*
Enter the first time: 900
Enter the second time: 1730
8 30hours
 */