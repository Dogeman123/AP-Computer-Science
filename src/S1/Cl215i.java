package S1;

// Michael Verdin
// Prog215i
public class Cl215i {
    private double mygal;
    private int myvehicle;
    private double mymiles;
    private double mympg;


    public Cl215i(int vehicle, double gal, double miles) {
        myvehicle = vehicle;
        mygal = gal;
        mymiles = miles;
        mympg = 0;
    }

    public void calc() {
        mympg = mymiles/mygal;
    }

    public int getMyvehicle() {return myvehicle;}
    public double getMygal() {return mygal;}
    public double getMymiles() {return mymiles;}
    public double getMympg() {return mympg;}
}