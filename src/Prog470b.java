//Michael Verdin
// Prog470b
import java.util.*;
import java.io.*;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));

            int[][] m1 = new int[5][5];

            for (int x = 0; x < m1.length; x++) {
                for (int g = 0; g < m1[0].length; g++) {
                    m1[x][g] = input.nextInt();
                    System.out.print(m1[x][g] + "\t");

                }
                System.out.println();
            }

            int mDiag = 0;
            for (int h = 0; h < 5; h++) {
                mDiag += m1[h][h];
            }
            System.out.println("Main Diagonal Sum: " + mDiag);

            int dig1 = 0;
            for (int h = 0; h < 5; h++) {
                dig1 += m1[h][4-h];
            }
            System.out.println("Other Diagonal Sum: " + dig1);




        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


