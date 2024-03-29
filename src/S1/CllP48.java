package S1;

// Michael Verdin
// 11/28/22
// LP-4-8
public class CllP48 {
    private final int myA;
    private final int myC;
    private final int myM;
    private int myX0; //Seed

    public CllP48(int a, int c, int m, int x0) {
        myA = a;
        myC = c;
        myM = m;
        myX0 = x0;

    }

    public int nextInt() {
        myX0 = (myA * myX0 + myC)% myM;
        return myX0;

    }
    public String toString(){
        return "(" + myA + " " + myX0 + " " + myC + ") % " + myM + " = " + this.nextInt();

    }
}