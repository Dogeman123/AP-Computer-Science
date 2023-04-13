package S1;

import java.util.*;
import java.io.IOException;
import java.io.File;
    public class Prog465c {
        public static void main(String[] args) {
            try {
                Scanner input = new Scanner(new File("data/prog465c.txt"));
                //Put code here

                int l = input.nextInt();
                int o = input.nextInt();

                int[][] m1 = new int[l][o];

                System.out.println("Original Table");
                for (int x = 0; x < m1.length; x++) {
                    for (int g = 0; g < m1[0].length; g++) {
                        m1[x][g] = input.nextInt();
                        System.out.print(m1[x][g] + "\t");

                    }
                    System.out.println();
                }
                System.out.println();

                int tots = 0;

                for (int k = 0; k < m1[0].length; k++) {
                    tots += m1[0][k];
                }
                for (int k = 0; k < m1[0].length; k++) {
                    tots += m1[m1.length-1][k];
                }
                tots += m1[1][0];
                tots += m1[1][m1[0].length-1];

                System.out.println("The total of the edges is: " + tots);



            }
            catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
    }

/*
Original Table
100	195	182	225
83	125	235	67
129	42	100	750
The total of the edges is: 1873
 */

