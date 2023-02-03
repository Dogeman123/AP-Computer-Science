package Prog702p;

public class Hiccas extends animals {
    private double myWorth;

    public Hiccas(String n, String w, double worth){
     super(n, w);
        myWorth = worth;

    }

    public double getWorth() {return myWorth;}
}
