// Michael Verdin
// Prog215i
public class Cl215i {
    private int myvehicalN;
    private double myGals;
    private double myMiles;
    private double myMPG;


    public Cl215i(int VN, double miles, double gals){
    myvehicalN = VN;
    myGals = gals;
    myMiles = miles;
    myMPG = 0;
    }
    public void calc(){
       int Bvnum =0;

        myMPG = myMiles/myGals;

    }

}
