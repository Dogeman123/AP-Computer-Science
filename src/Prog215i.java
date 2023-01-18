// Michael Verdin
// Prog215i
import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            ArrayList<Cl215i> list = new ArrayList<Cl215i>();

            while (input.hasNext()) {
                int id = input.nextInt();
                double hours = input.nextDouble();
                double code = input.nextDouble();
                double MPG = input.nextDouble();

                Cl215i fred = new InternetCustomer(id, hours, code, MPG);
                list.add(fred);


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


