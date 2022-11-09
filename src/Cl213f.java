// Michael verdin
// Prog213fArray
//11/8/22
public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }

    public void calc() {
        if (myKwh > 2000) {
            myCost = myKwh * .7;

            if (myKwh < 8000) {
                myCost = myKwh * .5;

                if (myKwh > 10000) {
                    myCost = myKwh * .4;
                }

            }
            //public String toString(); {
               //     return "The cost of";

            }
        }
    }
