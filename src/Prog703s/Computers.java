package Prog703s;

public class Computers implements comps{
    private String myName;
    private int myNum;
    private double myValue;

    public Computers(int num, String name){
        myName = name;
        myNum = num;
    }
    public String getName() { return myName; }
    public int getNumber() { return myNum; }
    public double getValue() { return myValue; }
}
