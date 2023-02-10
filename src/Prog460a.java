// Michael Verdin
// 2/10/23
// Prog460a
import java.util.*;
import java.io.IOException;
import java.io.File;
public class Prog460a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/sort.dat"));
        int[] list = new int[60];
        int cnt = 0;
        while(input.hasNext()){
            list[cnt] = input.nextInt();
            cnt++;
        }
        Arrays.sort(list);

        Scanner kbd = new Scanner(System.in);
        int num = 0;
        while (num!= -1){
            System.out.print("Enter a number to search for: ");
            num = kbd.nextInt();
            //int index = SearchAlgs.linearSearch(list,num);
            //int index = SearchAlgs.binarySearch(list, num);
            int index= SearchAlgs.binarySearchRec(list, num, 0,list.length-1);
            if(index == -1)
                System.out.println("Your number does not occur in this list");
                else
                    System.out.println("Your number occurs at position " + (index+1));
        }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
