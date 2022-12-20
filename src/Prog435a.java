// Michael Verdin
// Prog435a
import java.util.*;
import java.io.*;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));

            while(input.hasNext()){
                int car = input.nextInt();
                int gate = input.nextInt();

                Cl435a wow = new Cl435a(car,gate);

                System.out.print("");



            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}