// Michael Verdin
// Prog435a
import java.util.*;
import java.io.*;
public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));

            while(input.hasNext()){
               String Car = input.next();
                int car = input.nextInt();
                double gate = input.nextDouble();

                Cl435a wow = new Cl435a(car,gate);
                wow.calc();

                System.out.print(wow.toString());

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}