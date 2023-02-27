import S1.Cl408a;

import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog408a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
        Cl408a[] list = new Cl408a[21];
        int cnt = 0;
        while(input.hasNext()){
            int id = input.nextInt();
            int score = input.nextInt();
            list[cnt] = new Cl408a(id, score);
            cnt++;
        }

            list = SortingAlgs.insetionSort(list);
        System.out.println("Id\tScore");
        for(int lcv = 0; lcv < list.length; lcv++){
            System.out.println(list[lcv].getID() + "\t" + list[lcv].getScore());
        }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


