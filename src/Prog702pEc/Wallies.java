package Prog702pEc;

public class Wallies extends animals {
    private int mysteps;

    public Wallies(String n, String w, int s){
        super(n,w);
        mysteps = s;
    }
    public int getSteps() { return mysteps;}
}
