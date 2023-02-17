package Prog702q;
//City

public class Busses extends Vehicles {
    private String myCity;
    private int myValue;
    public Busses(String n, int t, String C){
        super(n,t);
        myCity = C;
        myValue = 50000;
    }
    public String getCity() { return myCity; }
}
