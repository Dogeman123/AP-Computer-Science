package Farm;

import java.util.*;
import java.io.IOException;
import java.io.File;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();


            // Cow Crap
            int cowRows = input.nextInt();
            int cowPens = input.nextInt();

            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            //Horse Crap
            int horseRows = input.nextInt();
            int horsePens = input.nextInt();

            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse fred = new Horse(name, weight, hayEaten, cornEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;



                    }
                    //Horse Crap
                    System.out.println("Horses");
                    System.out.print("Name\tWeight\t# of hay bales eaten\t\t# of corncobs eaten\t\t# of rides given\t\tCost of rides");
                    System.out.println();

                    double minHorse = Double.MAX_VALUE;
                    int minHorseIndex = 0;
                    for (int lcv = 0; lcv < animals.size(); lcv++) {
                        if (animals.get(lcv) instanceof Horse) {
                            Horse horse = (Horse) animals.get(lcv);
                            if (horse.value(cornCost, hayCost) < minHorse) {
                                minHorse = horse.value(cornCost, hayCost);
                                minHorseIndex = lcv;

                                double totHcost = cornCost + hayCost;
                            }
                        }
                    }



/*
1.The program should report the income of the day and the cumulative
 weight of all animals.

 2.The program should then determine if there
 is enough food to feed all the animals.

  3.The program should report
 the cow location that makes the most money.

 4. The program should report
  the horse location that makes the least money.

   5.The amount of money a cow makes is the money made for milk minus the cost
   of the feed for that animal for that day.

   6.The amount  money a horse makes is the money generated from giving rides
   minus the cost of the feed for that animal for that day.
    7.When a horse gives it name, it always reports it twice.
A pound of milk sells for $0.20.

 */

    System.out.println();





                    System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());
                }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

