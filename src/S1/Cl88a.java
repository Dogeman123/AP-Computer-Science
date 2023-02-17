package S1;// Michael Verdin
// Prog88aClass
// 10/18/22

public class Cl88a {
    private int Num;
    private int Num2;
    private int sum;
    private int Diff;
    private int Prod;
    private int avg;
    private int abb;
    private int max;
    private int min;

    public Cl88a(int myNum1, int myNum2){
        Num = myNum1;

        sum = myNum1 + myNum2;
        Diff = myNum1 - myNum2;
        Prod = myNum1 * myNum2;
        avg = sum/2;
        abb = Math.abs(Diff);
        max = 0;
        min = 0;

    }

    public void setStuff(){
        if (Num > Num2){
            max = Num;
        }else{
            max = Num2;
        }

        if(max==Num){
            min = Num2;
        }else{
            min = Num;
        }
    }
    public int getSum() { return sum;}
    public int getDiff() { return Diff;}
    public int getProd() { return Prod;}
    public int getAvg() { return avg;}
    public int getAbb() { return abb;}
    public int getmax() { return max;}
    public int getmin() { return min;}

}
