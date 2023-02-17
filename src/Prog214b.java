// Michael Verdin
// prog214b

import S1.Cl214b;

import java.util.*;
import java.io.*;
public class Prog214b {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));

        while (input.hasNext()){
           int Enum = input.nextInt();
            double hours = input.nextDouble();
            double rate = input.nextDouble();
           double sfacator = input.nextDouble();
            double gtyd = input.nextDouble();
            double Withhold = input.nextDouble();
            double FCIA = input.nextDouble();
            double Gross = input.nextDouble();
            double netpay = input.nextDouble();
            Cl214b wow = new Cl214b(Enum, hours,rate,sfacator,gtyd,Withhold
            , FCIA, Gross , netpay);
            wow.setStuff();

            System.out.println("Employee Number " + Enum);
          //  System.out.println("Hours " + hours );


        }


        } catch (IOException e){
            System.out.println("Can't find the data file");
        }
    }
}
