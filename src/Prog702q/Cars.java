package Prog702q;
//worth
public class Cars extends Vehicles {
 private double myWorth;

 public Cars(String n, double w) {
  super(n);
  myWorth = w;
 }
  public double getWorth() { return myWorth;}
}