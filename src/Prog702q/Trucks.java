package Prog702q;

public class Trucks extends Vehicles{
 //miles
    private double mymiles;

    public Trucks(String n, double m){
        super(n);
    mymiles = m;
    }
    public double getMiles() { return mymiles; }
}
