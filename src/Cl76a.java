// Michael Verdin
// Prog76aclass
public class Cl76a {
    private int num;
    private int multi;
    private int prod;
    private int Aws;

    public Cl76a(int mynum){
        num = mynum;
        multi = 9;
        prod = num * multi;
        Aws = prod * 12345679;

    }

    public void setStuff(){

    }

    public int getAws() {return Aws;}
    public int getProd() {return prod;}
}
