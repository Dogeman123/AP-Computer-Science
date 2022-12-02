public class CllP310 {
    private int NumB;
    private int numF;
    private int numS;
    private double Total;
    private double tax;
    private double Final;

    private double tendered;
    private double change;


    public CllP310(int B, int F, int S, double T, double C, double ten){
        NumB = B;
        numF = F;
        numS = S;
        tendered = T;
        change = C;
        Total = 0;
        tax = T;
        Final = 0;
        tendered = ten;

    }
    public void setStuff(){
        Total = (NumB * 1.69) + (numF * 1.09) + (numS *.99);
        Final = Total + tax;


    }
}
