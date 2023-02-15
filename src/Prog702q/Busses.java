package Prog702q;
//City

public class Busses extends Vehicles {
    private String myCity;

    public Busses(String n, int t, String C){
        super(n,t);
        myCity = C;
    }
    public String getCity() { return myCity; }
}
