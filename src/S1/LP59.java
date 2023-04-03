package S1;// Michael verdin

//10/7/22
// Michael Verdin
//10/3/22
//LP5-9

public class LP59 {
    public static void main(String[]  args){
        int num = 0;
        double num2= 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;

        while (num<6){
           num += 1;

           num2 = Math.pow(num, 2);
            num3 = Math.pow(num, 3);
            num4 = Math.pow(num, 4);
            num5 = Math.pow(num, 5);
           System.out.println(num + "   " + num2 + "   " + num3 + "   " + num4 + "   " + num5);

        }
    }
}

/*
1   1.0   1.0   1.0   1.0
2   4.0   8.0   16.0   32.0
3   9.0   27.0   81.0   243.0
4   16.0   64.0   256.0   1024.0
5   25.0   125.0   625.0   3125.0
6   36.0   216.0   1296.0   7776.0
 */