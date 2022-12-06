// Michael Verdin
// Prog214b
public class Cl214b {
    private int myEmployeeN;
    private double myHours;
    private double myRate;
    private double mySFactor;
    private double myGross;
    private double myGYTD;
    private double myWithhold;
    private double myFICA;
    private double myNetpay;

    public Cl214b(int Enum, double hours, double rate, double Sfactor, double gross,
                  double GYTD, double withhold, double FICA, double Netpay ){
        myEmployeeN = Enum;
        myHours = hours;
        myRate = rate;
        mySFactor = Sfactor;
        myGross = gross;
        myGYTD = GYTD;
        myWithhold = withhold;
        myFICA = FICA;
        myNetpay = Netpay;
    }
    public void setStuff(){
        myGross = myHours * myRate * mySFactor;

    }
}

