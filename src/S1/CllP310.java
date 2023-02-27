package S1;

public class CllP310 {
    private int NumB;
    private int numF;
    private int numS;
    private double Total;
    private double tax;
    private double Final;

    private double tendered;
    private double change;


    public CllP310(int B, int F, int S, double T, double ten){
        NumB = B;
        numF = F;
        numS = S;
        tax = T;
        change = 0;
        Total = 0;
        Final = 0;
        tendered = ten;

    }
    public void setStuff(){
        Total = (NumB * 1.69) + (numF * 1.09) + (numS *.99);
        Final = Total + tax;

        change = tendered - Final;

    }
    public double getTotal() { return Total;}
    public double getFinal() { return  Final;}
    public double getChange() {return change;}

}
