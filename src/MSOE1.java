// Michael Verdin
// MOSE-2016-1
import java.util.*;
public class MSOE1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a lowercase word: ");
        String Wrd = input.nextLine();

        for (int lcv = 0; lcv < Wrd.length(); lcv++) {
            if (Wrd.length() != Wrd.length() - 1 - lcv) {
                System.out.println(Wrd+ " is a palindrome");
            }else{
                System.out.println(Wrd + " Is not a hogq");
            }
        }
    }
}
/*
Enter a lowercase word: abba
abba is a palindrome
 */