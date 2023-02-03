package Prog702q;
//worth
    public class Cars extends Vehicles {
 private double myWorth;

     public Cars(String n,int t, double w) {
         super(n,t,w);
         myWorth = w;
 }
     public double getWorth() { return myWorth;}
}


