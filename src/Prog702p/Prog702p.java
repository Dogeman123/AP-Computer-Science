package Prog702p;

import java.util.*;
import java.io.IOException;
import java.io.File;

public class Prog702p {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<animals> list = new ArrayList<animals>();

            int num = input.nextInt();

            while (num != 99){
               String n = input.next();
               String w = input.next();
            if(num == 1){
              double wth = input.nextDouble();
              Hiccas h = new Hiccas(n,w,wth);
              list.add(h);
              } else if (num == 2) {
                int steps = input.nextInt();
                Wallies s = new Wallies(n,w,steps);
                list.add(s);
            }else if (num == 3){
                String wrd = input.next();
                Beepers ww = new Beepers(n,w,wrd);
                list.add(ww);
            }
            num = input.nextInt();
            }


            double totHiccasWorth = 0;
            int hiccasCnt = 0;
            double totWalliesSteps = 0;
            int walliesCnt = 0;
            double totBeepersLength = 0;
            int beepersCnt = 0;
            String large = "";
            String sm = "fj as;ldf meodimd[dedwqedededqwdqwfretghkkityftdsrfrgtyhtujrteseagtjd;aslkfja;slk dfja;skdfj ;alskdfj a;lskdfj a;lsk dfja;sldkj a;lskdfj ;asl dfkjas;ldkf jla;skdfj ;laksdjf;lkasdfj l;ak jsdfl;askdfj laskdfj l;askdfj la;sdkfj ;laskdfj ;laskdj f;askd fjas;ldkf j;asdk fjas;ldkfj as;lkfj sadl;kfj asdl;kfj sadk; fjlasl;kdsj fasl;kdfj as;ldkfj a;lsd fk;al skdf;al skdfj;a lskdfa;s ldfjka;slkdf ja;slk fja;lskdfj ;alskdfja;lsdkfj a;sl kdfa;lskfj a;lskdfj a;sldkfj as;ldkfj a;lskdf a;skdjf kl;asd;alskdjf;alskdfja;lsdkfj;alsdkfjal;sdkfjkfjdflsaj;lasdjk;l s ;;jj j ;kjk ;ljk ;ljkl  ;jjk;;jk lj  jkjk ;jj ;lkljkjjkl  ;lk lj;sad lfk;sad;fklsd fasdlf;k jsadl;kfj dsa;lf jdsal;f jkasdl ;fj fjsda fjal;s jfklsd;aj fl;sakjd fkl;adsflk;asjdf lsadjf kl;sadj flksdaj fl;kasdj fl;kasdfj ;lkas dfjal;sdkfj a;lsdfjk l;asdfjk;laksdfj ;lkasdfj ;lk asfjl;k fs;aldkj ;laks dfj;alsdkfj ;asd kfja;sldkfj ;asldkfj asd;lf as;dlkfj ";
            for (animals x : list) {
                if (x instanceof Hiccas) {
                    totHiccasWorth += ((Hiccas)x).getWorth();
                    hiccasCnt++;
                }
                if (x instanceof Wallies) {
                    totWalliesSteps += ((Wallies)x).getSteps();
                    walliesCnt++;
                }
                if (x instanceof Beepers) {
                    String xstring = ((Beepers)x).getSecretWord();
                    totBeepersLength += xstring.length();
                    beepersCnt++;
                }
            }

            System.out.println("The average value of the Hicca fur is: " + String.format("%.2f", (totHiccasWorth/hiccasCnt)));
            System.out.println("The average number of steps taken by the Wallies is: " + String.format("%.2f", (totWalliesSteps/walliesCnt)));
            System.out.println("The average size of the Beepers words is: " + String.format("%.2f", (totBeepersLength/beepersCnt)));





        }catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
The average value of the Hicca fur is: 3.06
The average number of steps taken by the Wallies is: 63.20
The average size of the Beepers words is: 7.25
*/

