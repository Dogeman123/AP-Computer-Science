package Prog875s;

import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog875s {
    public static void main(String[] args) {
        try {
            Scanner int1 = new Scanner(new File("data/h1-0homosapiens.fna"));
            Scanner int2 = new Scanner(new File("data/h1-0pantroglodytes.fna"));
            Scanner int3 = new Scanner(new File("data/h1-0musmusculus.fna"));

            //Primary Assembly
            String humangene1 = int1.nextLine();
            String dna1 = "";
            String line = int1.nextLine();
            while (line.charAt(0) != '>'){
                dna1 += line;
                line = int1.nextLine();
            }

            //Alternate assembly
            String humangene2 = line;
            String dna2 ="";
            line = int1.nextLine();
            while (int1.hasNext()){
                dna2 += line;
                line = int1.nextLine();
            }

            // Chimp assembly
            String chimpgene = int2.nextLine();
            String dnachimp = "";
            line = int2.nextLine();
            while (int2.hasNext()){
                dnachimp += line;
                line = int2.nextLine();
            }
            // Mouse assembly
            String mousegene = int3.nextLine();
            String dnamouse = "";
            line = int3.nextLine();
            while (int3.hasNext()) {
                dnamouse += line;
                line = int3.nextLine();
            }

            Gene hprimary = new Gene(humangene1, dna1);
            Gene halternate = new Gene(humangene2, dna2);
            Gene mprimary = new Gene(mousegene, dnamouse);
            Gene cprimary = new Gene(chimpgene, dnachimp);

            int mismatchPenalty = 3;
            int gapPenalty = 2;

            // Align human genes
            System.out.println("Human primary/Human alternate");
            int hhp = hprimary.align(halternate, mismatchPenalty,gapPenalty);

            // Align human gene with chimp
            System.out.println("\nHuman primary/Chimp");
            int hcp = hprimary.align(cprimary,mismatchPenalty,gapPenalty);
            System.out.println("Human alternate/Chimp");
            int hca = halternate.align(cprimary, mismatchPenalty, gapPenalty);

            // Align human gene with chimp
            System.out.println("\nHuman primary/Mouse");
            int hmp = hprimary.align(mprimary,mismatchPenalty,gapPenalty);
            System.out.println("Human alternate/Mouse");
            int hma = halternate.align(mprimary, mismatchPenalty, gapPenalty);

            // Report closet match
            String[] parings = { "Human primary/Chimp", "Human alternate/Chimp" +
                                  "Human primary/Mouse", "Human alternate/Mouse"  };
            int[] scores = {hcp, hca, hmp, hma};

            int min = 0;
            for (int lcv = 0; lcv < scores.length; lcv++)
                if (scores[lcv] < scores[min]) min = lcv;
            System.out.println("\nThe best pairing is " + parings[min] +
                    " with a score of " + scores[min]);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
