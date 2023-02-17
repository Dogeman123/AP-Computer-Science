package Prog702pEc;

import Prog702p.animals;

public class Beepers extends animals {
    private String mySecretWord;

    public Beepers(String n, String w, String word){
        super(n,w);
        mySecretWord = word;
    }
    public String getSecretWord() { return mySecretWord; }
}
