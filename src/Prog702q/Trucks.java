package Prog702q;

 public class Trucks extends Vehicles{
 //miles
    private double mymiles;

    public Trucks(String n, int t, double miles){
        super(n,t,miles);
    mymiles = miles;

    }
    public double getMiles() { return mymiles;}
}
