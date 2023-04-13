package S1;// Michael Verdin

//S1.Prog122c

//9/27/22

public class Prog122c {
    public static void main(String[] args){
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        double num4 = 0;


        while(num<10) {
            num += 2;
            num2 = num + 1;
            num3 = num * 2;
            num4= Math.pow(num, 2);

            System.out.println(num + "  " + num2 + "  " + num3 + "  " + num4);
        }


    }
}

/*
2  3  4  4.0
4  5  8  16.0
6  7  12  36.0
8  9  16  64.0
10  11  20  100.0
 */
