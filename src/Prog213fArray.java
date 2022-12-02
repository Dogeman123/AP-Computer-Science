// Michael verdin
// Prog213fArray
//11/8/22
import java.util.*;
import java.io.*;
public class Prog213fArray {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));

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
               System.out.println(list[lcv]);
            // System.out.println(list[].toString());



        } catch (IOException e){
            System.out.println("Can't find the data file");
        }

    }
}

/*
The cost of 387.0	0.0
The cost of 243.0	0.0
The cost of 302.0	0.0
The cost of 592.0	0.0
The cost of 790.0	0.0
The cost of 174.0	0.0
The cost of 648.0	0.0
The cost of 421.0	0.0
The cost of 1.0	0.0
The cost of 948.0	0.0
The cost of 919.0	0.0
The cost of 165.0	0.0
The cost of 341.0	0.0
The cost of 279.0	0.0
The cost of 932.0	0.0
The cost of 840.0	0.0
The cost of 77.0	0.0
The cost of 683.0	0.0
The cost of 145.0	0.0
The cost of 401.0	0.0
The cost of 165.0	0.0
The cost of 28.0	0.0
The cost of 909.0	0.0
The cost of 717.0	0.0
The cost of 299.0	0.0
The cost of 324.0	0.0
The cost of 617.0	0.0
The cost of 231.0	0.0
The cost of 695.0	0.0
The cost of 713.0	0.0
The cost of 784.0	0.0
The cost of 260.0	0.0
The cost of 980.0	0.0
The cost of 780.0	0.0
The cost of 503.0	0.0
The cost of 266.0	0.0
The cost of 794.0	0.0
The cost of 905.0	0.0
The cost of 122.0	0.0
The cost of 441.0	0.0
The cost of 826.0	0.0
The cost of 527.0	0.0
The cost of 820.0	0.0
The cost of 169.0	0.0
The cost of 200.0	0.0
The cost of 290.0	0.0
The cost of 108.0	0.0
The cost of 979.0	0.0
The cost of 871.0	0.0
The cost of 218.0	0.0
The cost of 418.0	0.0
The cost of 997.0	0.0
The cost of 284.0	0.0
The cost of 529.0	0.0
The cost of 551.0	0.0
The cost of 332.0	0.0
The cost of 965.0	0.0
The cost of 433.0	0.0
The cost of 756.0	0.0
The cost of 659.0	0.0
The cost of 940.0	0.0
The cost of 808.0	0.0
The cost of 886.0	0.0
The cost of 817.0	0.0
The cost of 894.0	0.0
The cost of 391.0	0.0
The cost of 68.0	0.0
The cost of 275.0	0.0
The cost of 877.0	0.0
The cost of 329.0	0.0
The cost of 511.0	0.0
The cost of 691.0	0.0
The cost of 934.0	0.0
The cost of 362.0	0.0
The cost of 737.0	0.0
The cost of 478.0	0.0
The cost of 390.0	0.0
The cost of 259.0	0.0
The cost of 228.0	0.0
The cost of 885.0	0.0
The cost of 907.0	0.0
The cost of 659.0	0.0
The cost of 568.0	0.0
The cost of 588.0	0.0
The cost of 829.0	0.0
The cost of 675.0	0.0
The cost of 5.0	0.0
The cost of 866.0	0.0
The cost of 51.0	0.0
The cost of 103.0	0.0
The cost of 719.0	0.0
The cost of 85.0	0.0
The cost of 571.0	0.0
The cost of 931.0	0.0
The cost of 421.0	0.0
The cost of 517.0	0.0
The cost of 482.0	0.0
The cost of 254.0	0.0
The cost of 148.0	0.0
The cost of 383.0	0.0

 */