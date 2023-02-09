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
            while (num <= 99) {
                String n = input.next();
                int t = input.nextInt();
                double w = input.nextDouble();

                if (num == 1) {
                    double worth = input.nextDouble();
                    Vehicles p = new Cars(n,t,worth);
                      list.add(p);
                }else if(num == 2){
                    int miles = input.nextInt();
                    Vehicles p = new Trucks(n,t,miles);
                    list.add(p);
                }else if(num == 3){
                    String City = input.nextLine();
                    Vehicles p = new Busses(n,t,City);

                }


            }
            } catch(IOException e){
                System.out.println("Can't find data file!");
            }
        }
    }



