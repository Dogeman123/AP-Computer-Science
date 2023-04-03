package S1;// Michael Verdin
// LP5-17
import java.util.*;
public class LP517 {
    public static void main(String[] args){
       Scanner imput = new Scanner(System.in);
        String password = ("programmer7");

        for(int c = 0; c < 3; c++){
            System.out.println("What is the password: ");
            String guess = imput.nextLine();
            if(guess.equals(password)) {
              System.out.println("Welcome");
              c= 4;
            } else {
                System.out.println("Incorrect ");
                if (c== 2) {
                    System.out.println("Access Denied");
                }
            }
        }
    }
}

/*
What is the password:
programmer7
Welcome

What is the password:
hogs
Incorrect
What is the password:
frogs
Incorrect
What is the password:
dogs
Incorrect
Access Denied
 */