// Michael Verdin
// Prog435a
public class Cl435a {
    private int mycar;
    private double myfactor;
    private String myType;
    private int mygate;
    private double mytoll;
    private double mycost;

    public Cl435a(int car, int gate){
        mycar = car;
        mygate = gate;
        mytoll = 0;
        mycost = 0;
        myType = "";
    }
    public void calc() {
        if(mycar == 1) {myType = "Compact car";}
       else if(mycar == 2) {myType = "Small Car"; myfactor = 1.0;}
       else if(mycar == 3) {myType = "Mid Size Car"; myfactor = 1.3;}
       else if(mycar == 4) {myType = "Full Size Car"; myfactor = 1.6;}
       else if(mycar == 5) {myType = "Truck"; myfactor = 2.0;}
       else if (mycar == 6) {myType = "16 Wheeler"; myfactor = 2.7;}

        if(mygate == 1) {mytoll=1.35;}
        else if(mygate == 2) {mytoll = 2.0;}
        else if(mygate == 3) {mytoll = 2.50;}
        else if(mygate == 4) {mytoll = 3.25;}
        else if(mygate == 5) {mytoll = 4.10;}
        else if(mygate == 6) {mytoll = 4.8;}
        else if(mygate == 7) {mytoll = 5.50;}
        else if(mygate == 8) {mytoll = 6.0;}


    }

    public double getMyfactor() {return myfactor;}
    public String getMytype() {return myType;}
    public int getMygate() {return mygate;}
    public double getMytoll() {return mytoll;}
    public double getMycost() {return mycost;}

}
