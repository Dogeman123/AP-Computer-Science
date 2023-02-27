package Prog702q;
//City
public class Busses extends Vehicles{
    private String myHome;
    private double myValue;

    public Busses(String n, int t, String h) {
        super(n,t);
        myHome = h;
        myValue = 50000;
    }

    public String getHome() {return myHome;}
    public double getValue() {return myValue;}


}