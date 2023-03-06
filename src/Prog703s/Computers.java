package Prog703s;

public class Computers implements comps {
    private String name;
    private int number;
    private double value;
    private  int type;

    public Computers(String name,int number,double value) {
        this.name = name;
        this.number = number;
        this.value = value;
    }
    public String getName() {return name;};
    public int getNumber() {return number;};
    public double getValue() {return value;};
}
