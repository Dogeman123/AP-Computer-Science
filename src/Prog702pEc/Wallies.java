package Prog702pEc;

import Prog702p.animals;

public class Wallies extends animals {
    private int mysteps;

    public Wallies(String n, String w, int s){
        super(n,w);
        mysteps = s;
    }
    public int getSteps() { return mysteps;}
}
