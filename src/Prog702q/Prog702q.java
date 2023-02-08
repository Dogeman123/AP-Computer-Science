package Prog702q;

import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/702q.dat"));
            List<Vehicles> list = new ArrayList<Vehicles>();

            int num = input.nextInt();
            while(num <= 99){
                String n = input.next();

                if(num == 1){
                    double g = input.nextDouble();

                }






            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


