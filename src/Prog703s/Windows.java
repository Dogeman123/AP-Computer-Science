package Prog703s;

public class Windows extends Computers {
    private double serviceNum;

    public Windows(String name, int n, double value, double sn){
        super(name,n, value);
        this.serviceNum = sn;
    }
    public double getServiceNum() {return serviceNum; }
}
