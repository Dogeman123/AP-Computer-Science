package Prog703s;

public class Linux extends Computers {
    private int code;

    public Linux(String name, int n, double value, int code){
        super(name,n,value);
        this.code = code;
    }
    public int getCode() {return code; }
}
