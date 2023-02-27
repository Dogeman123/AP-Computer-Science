import S1.Cl215i;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215i.txt"));
            ArrayList<Cl215i> pump = new ArrayList<Cl215i>();
            while (input.hasNext()) {
                int vehicle = input.nextInt();
                double gal = input.nextDouble();
                double miles = input.nextDouble();
                if (gal != 0 && miles != 0 )
                    pump.add(new Cl215i(vehicle, gal, miles));
            }
            for (Cl215i car: pump) {
                car.calc();
            }
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (int lcv = 0; lcv < pump.size(); lcv++){
                System.out.println(pump.get(lcv).getMyvehicle() + "\t" + pump.get(lcv).getMymiles() + "\t" +
                        pump.get(lcv).getMygal() + "\t" +  pump.get(lcv).getMympg());
            }
            int minindx = 0;
            int maxindx = 0;
            double min = pump.get(0).getMympg();
            double max = pump.get(0).getMympg();
            System.out.print("MPG Statistics: \nWorst:");
            for (int i = 0; i < pump.size(); i++) {
                if (pump.get(i).getMympg() < min) {
                    min = pump.get(i).getMympg();
                    minindx = i;
                }
            } System.out.println(pump.get(minindx).getMyvehicle());

            double avg = 0;
            System.out.print("Best:");
            for (int i = 0; i < pump.size(); i++) {
                if (pump.get(i).getMympg() > max) {
                    max = pump.get(i).getMympg();
                    maxindx = i;
                }
            }
            System.out.println(pump.get(maxindx).getMyvehicle());

            for (int lcv = 0; lcv < pump.size(); lcv++) {
                avg += pump.get(lcv).getMympg();
            }
            avg = avg/pump.size();

            System.out.println("Fleet Avg:\t\t" + avg );


            System.out.println("Number of vehicles: \t" + pump.size());



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

