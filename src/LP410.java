// Michael Verdin
// LP4-10
//10/5/22
import java.util.*;
public class LP410 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Regular Prism" );

    System.out.print("Enter the Length: ");
    int Length = input.nextInt();

    System.out.print("Enter the  width: ");
    int Width = input.nextInt();

    System.out.print("Enter the Height: ");
    int Height = input.nextInt();

    int volume = Length * Width * Height;

    System.out.println("The volume is: " + volume);

    System.out.println("Regular Sphere");

    System.out.print("Enter the radius: ");
    int Radius = input.nextInt();

    double Svolume = 4/3*3.14 * Math.pow(Radius, 3);

    System.out.println("The Volume is: " + Svolume);

    System.out.println("Cube");

    System.out.print("Enter the side lengths: ");
    int sides = input.nextInt();

    double Cvolume = Math.pow(sides, 3);

    System.out.println("The volume is: " + Cvolume);

    }
}

/*
Regular Prism
Enter the Length: 3
Enter the width: 4
Enter the Height: 5
The volume is: 60

Regular Sphere
Enter the radius: 3
The Volume is: 113.097

Cube
Enter the side lengths: 4
The volume is: 256.0
 */