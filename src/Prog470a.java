// Michael verdin
//1/5/23
// Prog470a
import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));
            int[][] mat = new int[6][6]; // 6 Row, 6 col Matrix
            for(int row = 0; row < mat.length-1; row++){
                for(int col = 0; col < mat[col].length-1; col++){
                    mat[row][col] = input.nextInt();
                }
            }

            for(int row = 0; row < mat.length-1; row++) {
                for (int col = 1; col < mat[0].length-1; col++) {

                    mat[5][col] += mat[row][col];


                }
            }
            for (int[] row : mat){
                for (int n : row){
                    System.out.print(n + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
171 178 174 152 86
 */