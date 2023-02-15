package Prog702q;

public class Trucks extends Vehicles {
   private int myMiles;

   public Trucks(String n, int t, int M){
    super(n,t);
    myMiles = M;
   }
   public int getMymiles() { return myMiles; }
}
