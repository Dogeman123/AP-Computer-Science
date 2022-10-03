import java.util.*;
import java.io.*;

public class dfile {
    public static void main(String[] args){
        try {
            Scanner imput = new Scanner(new File("../data/prog285b.dat"));
        } catch (IOException e){
            System.out.println("Can't find the data file");
        }

    }
}
