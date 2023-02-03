package Prog702q;
//City
public class Busses extends Vehicles{
    private String myCity;

    public Busses(String n, int t, String city){
        super(n,t,0);
        myCity = city;
    }
    public String getCity() { return myCity;}
}
