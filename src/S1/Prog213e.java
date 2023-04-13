package S1;

import java.util.*;
import java.io.*;
public class Prog213e {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog213e.dat"));

            System.out.println("Langer Family");
            System.out.print("Age\t\tGroup\t\tDistribution\t\tPercentage");
            while (input.hasNext()) {
                int Age = input.nextInt();
                int Group = input.nextInt();
                int dis = input.nextInt();
                double per = input.nextDouble();


                System.out.printf("5d\t\t%d\t\t%.2f\n", Age,Group,dis,per);
            }

        } catch (IOException e){
            System.out.println("Can't find the data file");
        }


    }
}

