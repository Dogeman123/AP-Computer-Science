import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] mat = new int[4][4];
            for(int row = 0; row < mat.length-1; row++){
                for(int col = 0; col < mat[col].length-1; col++){
                    mat[row][col] = input.nextInt();
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

