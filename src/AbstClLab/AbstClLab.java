package AbstClLab;
import java.util.Scanner;
public class AbstClLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // Circle
        System.out.print("Enter circle radius: ");
        double radius = kbd.nextDouble();
        Circle sh1 = new Circle(radius);
        // Rectangle
        System.out.print("Enter Height: ");
        double rHeight = kbd.nextDouble();
        System.out.print("Enter width: ");
        double rwidth = kbd.nextDouble();
        Shape sh2 = new Rectangle(rHeight, rwidth);
        //Triangle
        System.out.print("Enter triangle base: ");
        double tbase = kbd.nextDouble();
        System.out.print("enter triangle height: ");
        double theight = kbd.nextDouble();
        Shape sh3 = new Triangle(theight, tbase);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();

    }
}
