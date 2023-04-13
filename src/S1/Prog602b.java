package S1;

import S1.InternetCustomer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Michael Verdin
// S1.Prog602b
// 11/30/22


public class Prog602b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog602b.dat"));
            ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();

            while (input.hasNext()) {
                int id = input.nextInt();
                double hours = input.nextDouble();
                int code = input.nextInt();

                InternetCustomer fred = new InternetCustomer(id, hours, code);
                list.add(fred);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCustomer me = list.get(lcv);
                me.setCharge();
            }

            System.out.println("Account #\t\tHours\t\tCode\t\tAmount Due");
            for (InternetCustomer me : list) {
                System.out.println(me.getAcc() + "\t\t" +
                        me.getHours() + "\t\t" + me.getCode() + "\t\t" + me.getCharge());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}




/*

Account#	Hours		Code		Amount Due
1825		3.25		0		200.0
14063		17.06		1		661.8
17185		7.93		1		396.5
19111		12.0		2		700.0
20045		5.0		    1	    250.0
21352		5.84		0		242.0
22841		27.9		2		1087.0
23051		1.55		2		350.0
29118		15.02		0		550.6

         */
