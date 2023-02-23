package Farm;

public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String n, int weight, int corn, int hay){
        myName = n;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }
    public abstract double value(double cornCost, double hayCost);

    public String getName() { return myName; }
    public int getWeight() { return myWeight; }
    public int getNumCorn() { return myNumCorn; }
    public int getNumHayBales() { return myNumHayBales; }

    public double getFeedCoat(double cornCost, double hayCost){
        return myNumCorn * cornCost + myNumHayBales * hayCost;
    }
}
