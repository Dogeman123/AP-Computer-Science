import java.util.*;
import java.io.IOException;
import java.io.File;
    public class Prog901a {

        static boolean reverseString(String s) {
            if (s == null || s.length() <= 1) {
                System.out.println(s);
            }
            else {
                System.out.print(s.charAt(s.length() - 1));
            reverseString(s.substring(0,s.length() - 1));

        }
            return false;
        }

        public static void main(String[] args) {
            try {
                Scanner input = new Scanner(new File("data/prog512h.dat"));

                System.out.println(input.next());

                System.out.print(reverseString(input.next()));

            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
    }


    /*

     */