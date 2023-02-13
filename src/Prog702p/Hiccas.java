package Prog702p;

public class Hiccas extends animals {
    private double myWorth;

    public Hiccas(String n, String w, double fw){
     super(n, w);
        myWorth = fw;

    }

    public double getWorth() {return myWorth;}
}
