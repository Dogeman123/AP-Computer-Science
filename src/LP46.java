// Michael Verdin
// 10/10/22
// LP4-6
import java.util.*;
public class LP46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random Compnum = new Random();
        int num = Compnum.nextInt(10);

        Random Compnum2 = new Random();
        int num2 = Compnum.nextInt(10);



        String a = "/";
        String b = "*";
        String c = "+";
        String d = "-";


        Random Op = new Random();
        int o = Op.nextInt(10,14);


        System.out.print("What is: " + num  + " " + num2);


    }
}