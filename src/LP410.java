// Michael Verdin
// LP4-10
//10/5/22
import java.util.*;
public class LP410 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Regular Prism");

    System.out.print("Enter the Length: ");
    int Length = input.nextInt();

    System.out.print("Enter the width: ");
    int Width = input.nextInt();

    System.out.print("Enter the Height: ");
    int Height = input.nextInt();

    int volume = Length * Width * Height;

    System.out.print("The volume is: " + volume);

    System.out.print("Regular Sphere");

    System.out.print("Enter the radius: ");
    int Radius = input.nextInt();

    double Svolume = 4/3*3.14 * Math.pow(Radius, 3);

    System.out.print("The Volume is: " + Svolume);

    System.out.print("Cube");

    System.out.print("Enter the side lengths: ");
    int sides = input.nextInt();

    double Cvolume = Math.pow(sides, 4);

    System.out.print("The volume is: " + Cvolume);

    }
}

/*

 */