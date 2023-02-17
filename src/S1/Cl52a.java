package S1;

// Michael verdin
// S1.Prog52aClass
// 10/17/22
public class Cl52a {
    // Private data
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Constructor

    /**
     * Returns a new S1.Cl52a object
     * @param l length
     * @param w width
     */
    public Cl52a(int l,int w){
        myLen = l;
        myWid = w;
        myArea = 0;
        myPerim = 0;
    }
    // Mutator: Modifies private data
    public  void setStuff(){
        myArea = myArea * myLen;
        myPerim = 2 * myWid + 2 * myLen;
        // return; // a void method does NOT return anything -- the "empty return" is implicit
    }

    //Accessors: returns private data

    /**
     * Returns the area
     * @return the calculated area after getStuff()
     */
    public int getArea(){return myArea;}
    public int getPerim() {return myPerim;}





    // override method
    public  String toString() {
        return String.format("Area: %s\nPerimeter: %s", myArea, myPerim);
    }
        // easy print method
        public void print() {
            System.out.println(this.toString());
        }
}

/* Class:
 * Private data
 * Constructors
 * Modifiers (mutators)
 * Accessors

 */