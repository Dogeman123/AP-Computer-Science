package S1;

import java.io.*;
import java.util.*;

public class Prog465a {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465a.dat"));


            int[][] m1 = new int[4][4];
            int[][] m2 = new int[4][4];
            int[][] largest = new int[4][4];


            System.out.println("Matrix 1");
            for (int x = 0; x < m1.length; x++) {
                for (int g = 0; g < m1[0].length; g++) {
                    m1[x][g] = input.nextInt();
                    System.out.print(m1[x][g] );
                }
                System.out.println();
            }

            System.out.println("Matrix 2");
            for (int x = 0; x < m2.length; x++) {
                for (int g = 0; g < m2[0].length; g++) {
                    m2[x][g] = input.nextInt();
                    System.out.print(m2[x][g]);
                }
                System.out.println();
            }

            System.out.println("Largest elements");
            for (int x = 0; x < largest.length; x++) {
                for (int g = 0; g < largest[0].length; g++) {
                    largest[x][g] = Math.max(m1[x][g], m2[x][g]);
                    System.out.print(largest[x][g]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
