package Prog7301m;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Prog7301m {
    public static int argmax(double[] a){
        int max = 0;
        for(int i = 1; i < a.length; i++)
            if(a[i] > a[max]) max = i;
        return max;
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog7301m_train.csv"));



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


