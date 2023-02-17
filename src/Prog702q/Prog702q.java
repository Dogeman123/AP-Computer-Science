package Prog702q;

import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog702q{
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
                    Cars cw = new Cars(n, t, v);
                    list.add(cw);
                } else if (num == 2) {
                    int m = input.nextInt();
                    Trucks tm = new Trucks(n, t, m);
                    list.add(tm);
                } else if (num == 3) {
                    String cn = input.next();
                    Busses c = new Busses(n, t, cn);
                    list.add(c);
                }
                num = input.nextInt();
            }

            double totCarWorth = 0;
            int CarssCnt = 0;
            int totTruckmiles = 0;
            int walliesCnt = 0;
            String bussesnames = "";
            int bussesCnt = 0;
            String sm = "jdfalkjhflakshfafdasdfasdfsaf";
            for (Vehicles x : list) {
                if (x instanceof Cars) {
                    totCarWorth += ((Cars) x).getValue();
                    CarssCnt++;
                }
                if (x instanceof Trucks) {
                    totTruckmiles += ((Trucks) x).getMymiles();
                    walliesCnt++;
                }
                if (x instanceof Busses) {
                    String xstring = ((Busses)x).getCity();
                    bussesnames < bussesnames.l;
                    bussesCnt++;

                    if (xstring.length() > bussesnames.length())
                        bussesnames = xstring;
                    if(xstring.length() < sm.length())
                        sm = xstring;

                }
            }



            System.out.println("The total worth of the cars is: " + totCarWorth);



        } catch(IOException e){
                System.out.println("Can't find data file!");
            }
        }
    }



