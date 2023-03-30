import java.util.*;
import java.io.IOException;
import java.io.File;
    public class Prog901a {
        public static void printFile(Scanner input) {

            String str = input.nextLine();
            System.out.println("Normal: ");
            System.out.println(str);
            String back = reverseString(str);
            System.out.println("Backwards: ");
            System.out.print(back);

        }

        public static String reverseString(String s) {
            if (s == null || s.length() <= 1) {
                return s;
            }
            return reverseString(s.substring(1))+s.charAt(0);
        }

        public static void main(String[] args) {
            try {
                Scanner input = new Scanner(new File("data/prog512h.dat"));
                printFile(input);


            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
    }


    /*

     */