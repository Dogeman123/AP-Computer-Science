package S1;// Michael Verdin
// LP4-2
//10/5/22

import java.util.*;

public class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in kilograms: ");
        int Weight = input.nextInt();

        System.out.print("Enter the length in centimeters: ");
        int length = input.nextInt();

        System.out.print("Enter the width in centimeters: ");
        int width = input.nextInt();

        System.out.print("Enter the height in centimeters: ");
        int height = input.nextInt();

        int Size = length * width *height;



        if (Weight > 27){
            System.out.print("Too heavy");
        }

        if (Size > 100000){
            System.out.print("Too Large ");
        }

    }
}

/*
Enter the weight in kilograms: 32
Enter the length in centimeters: 10
Enter the width in centimeters: 25
Enter the height in centimeters: 38
Too heavy
 */