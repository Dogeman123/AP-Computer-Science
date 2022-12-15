public class Cl214c {
    private String myGas;
    private double myCost;
    private double myGallons;
    private double myGcost;
    private double myWash;
    private double myTotal;

    public Cl214c(String Gas,double Cost,double Gallons, double Gcost, double Wash, double Total){
        myGas = Gas;
        myCost = 0;
       myGallons = Gallons;
        myGcost = 0;
        myWash = Wash;
        myTotal = 0;

    }public void setStuff(){
        if(myGas == "Premium"){
            myCost = 1.479;

        }if (myGas == "Regular"){
            myCost = 1.359;

        } else{
            myCost = 1.429;
        }


    }
}
