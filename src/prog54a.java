import java.util.*;

public class prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the model of the car ");
        String  model = keyboard.nextLine();

        System.out.print("How many miles were driven ");
        double miles = keyboard.nextDouble();

        System.out.print("How many gallons were used ");
        double gallons = keyboard.nextDouble();

        double mpg = miles/gallons;
        System.out.println("the average MPG used by the " + model + " are "  +mpg + "Miles per gallon ");

    }
}

/*
Good
public class prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the model of the car ");
        String  model = keyboard.nextLine();

        System.out.print("How many miles were driven ");
        double miles = keyboard.nextDouble();

        System.out.print("How many gallons were used ");
        double gallons = keyboard.nextDouble();

        double mpg = miles/gallons;
        System.out.println("the average MPG used by the " + model + " are "  +mpg + "Miles per gallon ");

    }
}
 */
