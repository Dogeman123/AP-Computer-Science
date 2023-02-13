package Prog702p;
import java.util.*;
import java.io.IOException;
import java.io.File;

public class Prog702p {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog702q.dat"));
            List<animals> list = new ArrayList<animals>();

            int num = input.nextInt();
            while (num != 99){
               String n = input.next();

            }




        }catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


