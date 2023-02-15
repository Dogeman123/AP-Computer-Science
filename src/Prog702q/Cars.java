package Prog702q;
//worth
public class Cars extends Vehicles{
    private double myValue;

    public Cars(String n, int t, double v){
        super(n,t);
        myValue = v;
    }
    public double getValue() { return myValue;}
}


