package Prog702q;

public class Vehicles implements names{
    private String myName;
    private int myTire;
    private double myValue;

    public Vehicles(String name, int tire, double value){
        myName = name;
        myTire = tire;
        myValue = tire;
    }
    public String getName() { return myName; }
    public int getTire() { return  myTire; }
    public double getValue() { return myValue;}
}
