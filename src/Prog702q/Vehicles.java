package Prog702q;

public class Vehicles implements names {
    private String myName;
    private int mytire;
    private double myValue;
    public Vehicles(String n, int t){
        myName = n;
        mytire = t;

    }
    public String getName() { return myName; }
    public int getTire() {return mytire;}
    public double getValue() {return myValue; }
}
