// Michael Verdin
// Prog 214c ArrayList

import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog214cArrayList {
    public static void main(String[] args) {
       ArrayList<Cl214c> List = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("data/prog214c.dat"));

            while (input.hasNext()){
                String GasType = input.nextLine();
              double Gallons = input.nextDouble();
                double GasAmount = input.nextDouble();
                String Wash = input.nextLine();
                double WashC = input.nextDouble();

                Cl214c wow = new Cl214c(GasType,GasAmount,Gallons, Wash, WashC);
                List.add(wow);
            }

            for(int lcv = 0; lcv <List.size(); lcv++){
                Cl214c me = List.get(lcv);
                me.setStuff();
            }
            for (Cl214c me : List){
              System.out.println(me.getGallons());

                System.out.println("COMPSCI PETROLEUM COMPANY");
                System.out.println("Premium");
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}