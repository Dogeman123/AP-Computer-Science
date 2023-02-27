package Prog702pEc;

import java.util.*;
import java.io.IOException;
import java.io.File;

public class Prog702p {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<animals> list = new ArrayList<animals>();

            int num = input.nextInt();

            while (num != 99){
                String n = input.next();
                String w = input.next();
                if(num == 1){
                    double wth = input.nextDouble();
                    Hiccas h = new Hiccas(n,w,wth);
                    list.add(h);
                } else if (num == 2) {
                    int steps = input.nextInt();
                    Wallies s = new Wallies(n,w,steps);
                    list.add(s);
                }else if (num == 3){
                    String wrd = input.next();
                    Beepers ww = new Beepers(n,w,wrd);
                    list.add(ww);
                }
                num = input.nextInt();
            }


            double totHiccasWorth = 0;
            int hiccasCnt = 0;
            double totWalliesSteps = 0;
            int walliesCnt = 0;
            double totBeepersLength = 0;
            int beepersCnt = 0;


            for (animals x : list) {
                if (x instanceof Hiccas) {
                    totHiccasWorth += ((Hiccas)x).getWorth();
                    hiccasCnt++;
                }
                if (x instanceof Wallies) {
                    totWalliesSteps += ((Wallies)x).getSteps();
                    walliesCnt++;
                }
                if (x instanceof Beepers) {
                    String xstring = ((Beepers)x).getSecretWord();
                    totBeepersLength += xstring.length();
                    beepersCnt++;


                }
            }



            System.out.println("The average value of the Hicca fur is: " + String.format("%.2f", (totHiccasWorth/hiccasCnt)));
            System.out.println("The average number of steps taken by the Wallies is: " + String.format("%.2f", (totWalliesSteps/walliesCnt)));
            System.out.println("The average size of the Beepers words is: " + String.format("%.2f", (totBeepersLength/beepersCnt)));
            System.out.println("The most common letters in the beepers words is: ");




        }catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
The average value of the Hicca fur is: 3.06
The average number of steps taken by the Wallies is: 63.20
The average size of the Beepers words is: 7.25
*/
