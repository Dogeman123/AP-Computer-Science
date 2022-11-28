// Michael Verdin
// 11/28/22
// String interview Question 6
import java.util.*;
public class StrInterview6Array {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = kbd.nextLine().toLowerCase();
        String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] count = new int[26];

        for (int lcv =0; lcv < str.length(); lcv++){
            for(int lcv2 =0; lcv2 < ab.length(); lcv2++){
                if (str.substring(lcv, lcv+1).equals(ab.substring(lcv2,lcv2+1)))
                    count[lcv2]++;
            }
        }

        int unique = 0;
        for (int n : count)
            if (n > 0) unique++;
        System.out.println("Unique letters: " + unique);
    }
}
