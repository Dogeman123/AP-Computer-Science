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
        if(myGas == "Premium"){
            myGcost = 1.479;

        }if (myGas == "Regular"){
            myGcost = 1.359;

        } else{
            myGcost = 1.429;
        }



        myCost = myGcost * myGallons;

        myTotal = myCost + myWash;


    }

    public double getMyGallons() { return myGcost;}
    public double getMyCost() {return myCost;}
    public double getMyTotal() {return myTotal;}
}
