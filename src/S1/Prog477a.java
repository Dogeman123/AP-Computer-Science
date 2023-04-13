package S1;// Michael Verdin
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        int[][] counts = new int[5][3];
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            while (input.hasNext()) {
                int gender = input.nextInt();
                int grade = input.nextInt();
                counts[grade-1][gender-1]++;
            }
        } catch (IOException e) {
            System.out.println("Can't find the data file!");
        }


        System.out.println("Grade " + " Male " + " Female " + " Total");
        for (int i = 0; i < 5; i++) {
            System.out.print((char)('A' + i) + "\t");
            int gradeTotal = 0;
            for (int g = 0; g < 2; g++) {
                System.out.print(counts[i][g] + "\t");
                gradeTotal += counts[i][g];
            }
            System.out.println(gradeTotal);
        }

        System.out.println("___________________________");

        System.out.print("Totals\t");
        int sexTotal = 0;
        for (int i = 0; i < 2; i++) {
            for (int cnt = 0; cnt < 5; cnt++) {
                sexTotal += counts[cnt][i];
            }
            System.out.print(sexTotal + "\t");
            sexTotal = 0;
        }
    }
}

/*
Grade  Male  Female  Total
A	2	4	6
B	4	4	8
C	4	7	11
D	2	3	5
E	3	0	3
___________________________
Totals	15	18
 */