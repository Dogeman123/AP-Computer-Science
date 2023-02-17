package S1;

public class Cl214c {
    private String myGas;
    private double myCost;
    private double myGallons;
    private double myGcost;
    private double myWash;
    private double myTotal;
    private String myWasht;
    private double myWashCost;
    public Cl214c(String Gas,double Gallons,double Wash,String WashT, double WashCost){
        myGas = Gas;
        myCost = 0;
       myGallons = Gallons;
        myGcost = 0;
        myWash = Wash;
        myWasht = WashT;
        myTotal = 0;
        myWashCost = WashCost;
    }public void setStuff(){
        if(myGcost == 1.479) {myGas = "Premium";}
        else if(myGcost == 1.359) {myGas = "Regular";}
        else if(myGcost == 1.429) {myGas = "High Octane";}

        myCost = myGcost * myGallons;

        myTotal = myCost + myWash;

    }

    public double getGallons() { return myGcost;}
    public double getCost() {return myCost;}
    public double getTotal() {return myTotal;}
}
