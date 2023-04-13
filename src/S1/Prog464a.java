package S1;

import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));

            // 5 arrays of length 6
            int[][] mat = new int [5][6]; // 5 rows 6 columns
            for(int row =0; row < mat.length; row++){
                for (int col = 0; col < mat[0].length-1; col ++){
                    mat[row][col] = input.nextInt();
                    //read int 5x5 matrix
                }
            }
            // Find the biggest number in each row,
            // Then set the last column to that number
            // for every single row
            for(int r =0; r < mat.length; r++){
                int rowbig = Integer.MIN_VALUE;
                for(int c =0; c < mat[0].length-1; c++){
                    if(mat[r][c] > rowbig)
                        rowbig = mat[r][c];
                }
                mat[r][5] = rowbig;
            }
            // Print out the 2D Array nicely
            for(int[] row : mat){
                for(int num : row){
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


