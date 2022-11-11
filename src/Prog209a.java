import java.util.*;
import java.io.*;
public class Prog209a {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/Prog215a.dat"));

          while(input.hasNext()){
              int num = input.nextInt();
              int num2 = input.nextInt();
              int num3 = input.nextInt();
              int num4 = input.nextInt();

              System.out.println("The numbers between " + num + " " + num2 + "is " + num3);
            }





        } catch (IOException e){
            System.out.println("Can't find the data file");
        }

    }
}
