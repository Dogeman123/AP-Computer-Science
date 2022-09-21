// Michael verdin
// 9/21/22
// Prog166e
public class Prog166e {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        double c;

        // (while condition1 && condition2) are both true....
        // While (condition || condition2) either one or both are true
        while (a<16 && b<=15){
            a += 1;
            if(a == b){
                b++;
                if(a != 14){
                    a=1;
                }
            }
            c = (double)a/b;
            System.out.printf( "%d/%d\t\t%.5f\n",a, b ,c);

        }
    }
}
