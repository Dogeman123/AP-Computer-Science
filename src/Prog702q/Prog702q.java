package Prog702q;

import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog702q.txt"));
            List<Vehicles> list = new ArrayList<Vehicles>();

            int num = input.nextInt();
            while (num != 99) {
                String n = input.next();
                int t = input.nextInt();

                if (num == 1) {
                    double v = input.nextDouble();
                    Vehicles p = new Cars(n, t, v);
                    list.add(p);
                } else if (num == 2) {
                    double m = input.nextDouble();
                    Vehicles p = new Trucks(n, t, m);
                    list.add(p);
                } else if (num == 3) {
                    String h = input.next();
                    Vehicles p = new Busses(n, t, h);
                    list.add(p);
                }
                num = input.nextInt();
            }
            int tot = 0;
            double cworth = 0;
            double vworth = 0;
            double tworth = 0;
            String longest = "";
            int ttotc = 0;
            int ttott = 0;
            int ttotb = 0;
            double least = 1000000;
            for (Vehicles x : list) {
                if (x instanceof Cars) {
                    cworth += ((Cars)x).getValue();
                    tot++;
                    ttotc += ((Cars)x).getTire();
                    vworth += cworth;
                }
                if (x instanceof Trucks) {
                    tworth += ((Trucks)x).getValue();
                    if (tworth < 1000)
                       least  = tworth;
                    tot++;
                    ttott += ((Trucks)x).getTire();
                    vworth += tworth;
                }

                if (x instanceof Busses) {
                    String xstring = ((Busses)x).getHome();
                    if (xstring.length() > longest.length())
                        longest = xstring;
                    ttotb = ((Busses)x).getTire();
                    vworth += ((Busses)x).getValue();

                    tot++;
                }
            }

            System.out.println("The total number of vehicles is: " + tot);
            System.out.println("The  value of the cars is: " + cworth);
            System.out.println("The total worth of the vehicles is: " + vworth);
            System.out.println("The longest home name is: " + longest);
            System.out.println("The truck with the least value is: " );
            System.out.println("The total number of tires is: " + (ttotc + ttotb + ttott));

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


