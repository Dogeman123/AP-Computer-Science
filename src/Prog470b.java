import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));

            int[][] mat = new int[6][6]; // 6 Row, 6 col Matrix
            for(int row = 0; row < mat.length-1; row++){
                for(int col = 0; col < mat[row].length-1; col++){
                    mat[row][col]=input.nextInt();
                }
            }

            for(int r = 0; r < mat.length-1; r++){
                for(int c = 0; c < mat[0].length-1; c++){
                    System.out.print(mat[r][c]+ " ");


                }


                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


