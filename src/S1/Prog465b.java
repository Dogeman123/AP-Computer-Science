package S1;

import java.util.*;
import java.io.*;
class Prog465b {
    public static void main(String[] args) {
        try {
            int count = 0;
            int[][] nums = new int[1][1];
            Scanner input = new Scanner(new File ("data/prog465b.dat"));

            int[][] originalTable = new int[1][1];
            for (int i = 0; i < originalTable.length; i++) {
                for (int j = 0; j < originalTable[i].length; j++) {
                    originalTable[i][j] = input.nextInt();
                    if (originalTable[i][j] < 100) {
                        nums[count][0] = i + 1;
                        nums[count][1] = j + 1;
                        count++;
                    }
                }
            }

            System.out.println("Original table:");
            for (int i = 0; i < originalTable.length; i++) {
                for (int j = 0; j < originalTable[i].length; j++) {
                    System.out.print(originalTable[i][j]);
                }
                System.out.println();
            }

            System.out.println("\nNumbers Less Than 100:");
            System.out.println("Row\tColumn");
            for (int i = 0; i < count; i++) {
                System.out.println(nums[i][0] +  nums[i][1]);
            }
        } catch (IOException e){
            System.out.println("Cant find data file!");
        }
    }
}
