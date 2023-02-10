package Prog702q;

public class Vehicles implements names{
    private String myName;
    private int myTire;

    public Vehicles(String n, int t){
        myName = n;
        myTire = t;
    }
    public String getName() { return myName; }
    private int getTire() {return myTire;}
}
