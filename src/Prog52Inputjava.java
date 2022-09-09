import java.util.Scanner;

public class Prog52Inputjava {
    public static void main (String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Please enter the length ");
            String len = input.nextLine();

            int leng = input.nextInt();


           System.out.print("Please enter the length");
            System.out.println();
            int wid = input.nextInt();
           System.out.println();

            System.out.print("Please enter the width ");

            int area = leng * wid;
            int perim = 2 * leng + 2 * wid;
            System.out.println("the area is " + area);
            System.out.println("the perim is " + perim);
        }
    }

