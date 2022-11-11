// Michael Verdin
// prog54cClass
public class Cl54c {
    private double Radius;
    private double Area;
    private double Circum;

    public Cl54c(int myRadius) {
        Radius = myRadius;

        Area = 3.1415 * Math.pow(myRadius, 2);
        Circum = 2 * 3.14159 * myRadius;

    }
        public void setStuff(){
    }
    public double getRad() { return Radius;}
    public double getArea() { return Area;}
    public double getCircum() { return Circum;}

}
