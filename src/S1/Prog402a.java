package S1;

import java.util.*;
import java.io.*;
public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prg402a.dat"));
            int[] id = new int[21];
            double[] score = new double[21];

            for (int i = 0; i < id.length; i++) {
                id[i] = input.nextInt();
                score[i] = input.nextDouble();
            }

            double sum = 0;

            for (int i = 0; i < score.length; i++) {
                sum += score[i];
            }

            double doubSum = sum;
            double average = doubSum / 21;
            double[] diff = new double[21];
            for (int i = 0; i < score.length; i++) {
                diff[i] = score[i] - average;
            }
            System.out.println("ID\t\tScore\t\tDifference");
            for (int i = 0; i < id.length; i++) {
                System.out.println(id[i] + "\t\t" + score[i] + "\t\t" + String.format("%.2f", diff[i]));

            }
            System.out.print("The Average is: " + average);
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}

/*
ID		Score		Difference
115		257.0		14.38
123		253.0		10.38
116		246.0		3.38
113		243.0		0.38
112		239.0		-3.62
104		239.0		-3.62
110		238.0		-4.62
218		243.0		0.38
208		242.0		-0.62
222		223.0		-19.62
223		230.0		-12.62
213		229.0		-13.62
207		228.0		-14.62
203		224.0		-18.62
305		265.0		22.38
306		262.0		19.38
311		256.0		13.38
325		246.0		3.38
321		245.0		2.38
323		245.0		2.38
301		242.0		-0.62

The Average is: 242.61904761904762
 */