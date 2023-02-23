package Farm;

public class Cow extends Animal {
    private double myMilk;
    private final double MILK_PRICE_LB = 0.20;

    public Cow(String n, int weight, double milk, int corn, int hay){
        super(n,weight,corn,hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost){
        return myMilk * MILK_PRICE_LB - getFeedCoat(cornCost, hayCost);
    }
    public double getMilk() { return myMilk; }
    public double getMilkPrice() { return MILK_PRICE_LB; }
}
