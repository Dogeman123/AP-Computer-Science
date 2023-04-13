package S1;// Michael Verdin
//12/5/2022
//S1.Prog213v
import S1.ArrayListTest;
import S1.Transaction;

import java.util.*;
import java.io.*;
public class Prog213v {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("data/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<Transaction>();

            double balance = input.nextDouble();
            ArrayListTest.Bank wow = new ArrayListTest.Bank(balance);

            String code = input.next();
            while (!(code.equals("E"))){
                double amount = input.nextDouble();
                Transaction fred = new Transaction(code, amount);
                list.add(fred);
                code = input.next();

            }

            for (int lcv =0; lcv < list.size(); lcv++)
                wow.calc(list.get(lcv));
            System.out.println("The final balance is: $" + wow.getAmount());
        } catch (IOException e){
            System.out.println("Can't find the data file");
        }

    }
}
