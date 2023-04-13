package S1;// Michael Verdin
//10/24/22
// Prog285bCl
import java.util.*;
import java.io.*;
public class Prog285bClass {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            while(input.hasNext()){
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();
                Salesperson fred = new Salesperson(id,c,s);
                fred.setcomm();
                System.out.println(fred.toString());
            }
        } catch (IOException e){
            System.out.print("Cant find the data File!!");
        }
    }
}

/*
101	17	2250.0	0.0
103	5	4000.0	0.0
117	3	7350.0	0.0
118	8	7350.0	0.0
125	5	6500.0	0.0
138	17	6375.0	0.0
192	8	8125.0	0.0
203	8	3250.0	0.0
218	5	5000.0	0.0
235	5	5250.0	0.0
264	17	4150.0	0.0
291	17	750.0	0.0

Process finished with exit code 0

 */