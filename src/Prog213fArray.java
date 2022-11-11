// Michael verdin
// Prog213fArray
//11/8/22
import java.util.*;
import java.io.*;
public class Prog213fArray {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog213f.dat"));

            Cl213f[] list = new Cl213f[1000];
            int cnt = 0;

            while (input.hasNext()) {
                int kwh = input.nextInt();

                Cl213f yikes = new Cl213f(kwh);
                list[cnt]= yikes;
                cnt++;
            }

            for (int lcv =0; lcv <100; lcv++)
                list[lcv].calc();

            for (int lcv =0; lcv <100; lcv++)
               System.out.println(list[cnt]);
            // System.out.println(list[lcv].toString());



        } catch (IOException e){
            System.out.println("Can't find the data file");
        }

    }
}