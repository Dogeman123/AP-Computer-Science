// Michael Verdin
// prog214b

import java.util.*;
import java.io.*;
public class Prog214b {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));
        while (input.hasNext()){
            int Enum = input.nextInt();
            double Gross = input.nextDouble();
            double gtyd = input.nextDouble();
            double Withhold = input.nextDouble();
            double FCIA = input.nextDouble();

            Cl214b wow = new Cl214b(Enum,Gross,gtyd,Withhold, FCIA);


        }




        } catch (IOException e){
            System.out.println("Can't find the data file");
        }
    }
}
