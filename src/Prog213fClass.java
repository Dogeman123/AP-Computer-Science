import java.util.*;
import java.io.*;
public class Prog213fClass {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213f.dat"));

            while (input.hasNext()) {
                int num = input.nextInt();
                double cost = 0;


                if (num > 2000) {
                    cost = num * .07;

                  if  (num < 8000) {
                        cost = num * .05;
                    }
                    if (num > 10000) {
                        cost = num * .04;
                    }


                }
                System.out.println("The cost of " + num + " is " + cost);

            }
                } catch(IOException e){
                    System.out.println("Can't find the data file");
                }

            }
        }

        /*
        The cost of 1338 is 0.0
The cost of 9631 is 674.1700000000001
The cost of 13561 is 542.44
The cost of -999 is 0.0

         */