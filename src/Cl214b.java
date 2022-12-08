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

    public Cl214b(int Enum, double hours, double rate, double Sfactor,
                  double GYTD) {
        myEmployeeN = Enum;
        myHours = hours;
        myRate = rate;
        mySFactor = Sfactor;
        myGross = 0;
        myGYTD = GYTD;
        myWithhold = 0;
        myFICA = 0;
        myNetpay = 0;
    }

    public void setStuff() {
        myGross = myHours * myRate * mySFactor;

        // Withhold
         if (myGross < 149.99){
            myWithhold = myGross * .8;
        } else if (myGross < 199.00){
            myWithhold = myGross * .12;
        } else if (myGross < 299.999){
            myWithhold = myGross * .15;
        } else if (myGross > 300){
             myWithhold = myGross *.175;
         }
         else {
             myWithhold = 0;
         }

         //FICA
       if (myGYTD > 17300){
           myFICA = 0;
       }else if (myGYTD + myGross <= 17300){
           myFICA = .0605 *myGross;
       }else if (myGYTD < 17300 && (myGross + myGYTD) > 17300){
           myFICA = 17300 - (myGross + myGYTD);



       }


        }

        public double getMyGross() {return myGross;}
        public double getMyWithhold() {return myWithhold;}
        public double getMyFICA() { return myFICA;}


        }




