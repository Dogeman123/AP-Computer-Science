package S1;

import java.util.*;
import  java.io.*;

public class Prog285b {
        public static void main(String[] args){
            try {
                Scanner imput = new Scanner(new File("data/prog285b.dat"));
            System.out.println("ID\t\tCode\tSales\t\tCommission");
            System.out.print("---------------------------------------");
            while (imput.hasNext()){
                int id = imput.nextInt();
                int c= imput. nextInt();
                double s = imput.nextDouble();
                double com = 0;

                if(c == 5 ||c== 8){
                    if (s<= 5000)
                        com = s *0.075;
                  else
                    com = 5000 * 0.75 + (s - 5000 *0.085);
                } else if (c == 17){
                  if (s<= 3500)
                     com = s * 0.095;
                else
                    com = 3500 * 0.095 + (s - 3500) * 0.12;

                }
            System.out.printf("5d\t\t%d\t\t%.2f\n", id, c, s, com);
            }

            } catch (IOException e){
                System.out.println("Can't find the data file");
            }

        }
    }


