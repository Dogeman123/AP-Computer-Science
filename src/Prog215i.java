// Michael Verdin
// Prog215i
import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215i.dat"));
            ArrayList<Cl215i> list = new ArrayList<Cl215i>();

            while (input.hasNext()) {
                int Vn = input.nextInt();
                double miles = input.nextDouble();
                double gals = input.nextDouble();
                double MPG = input.nextDouble();

                Cl215i fred = new Cl215i(Vn, miles, gals);
                list.add(fred);





            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


