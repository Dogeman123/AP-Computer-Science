// Michael Verdin
// Prog82aClass

public class Cl82a {
    private int limit;
    private int speed;
    private double fine;
    private int charge;
    private int fee;

    public Cl82a(int myLimit, int mySpeed) {
        limit = myLimit;
        speed = mySpeed;
        charge = mySpeed - limit;
        fee = (charge * 5) + 20;


    }

    public void setStuff() {


    }

    public int getCharge(){ return charge; }
    public int getSpeed() {return speed; }
    public int getFee() {return  fee;}
    public int getLimit() {return limit;}
}
