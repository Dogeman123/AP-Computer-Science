// Michael Verdin
// prog54cClass
import java.util.*;
public class Prog54cClass {
    public static void main(String[] args) {

        int rad = 3;

        Cl54c wow = new Cl54c(rad);

        wow.setStuff();


        double area = wow.getArea();
        double circum = wow.getCircum();

        System.out.println("The radius of the circle is: " + rad);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The circumference of the circle = " + circum);


    }
}
/*
The radius of the circle is: 3
The Area of the circle = 28.273500000000002
The circumference of the circle = 18.849539999999998
 */