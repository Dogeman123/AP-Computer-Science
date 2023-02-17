package Prog702pEc;

import Prog702p.names;

public class animals implements names {
    private String myName;
    private String myWord;

    public animals(String n, String w){
        myName = n;
        myWord = w;

    }
    public String getName() { return myName; }
    public String getWord() { return myWord; }

}
