public class Prog122a {

    // 9/22/22
    // Michael Verdin

    public static void main(String [] args){
        int number = 0;
        int numberSquared =0;
        double numberRoot = 0;
        System.out.println("Number" + "      " + "Square" + "      " + "Square root");
        while (number< 51) {
            numberRoot = Math.round(numberRoot * Math.pow(10, 4)) / Math.pow(10, 4);
            System.out.println(number + "      " + numberSquared + "      " + numberRoot);
            number+= 1;
            numberSquared = number * number;
            numberRoot= Math.sqrt(number);
        }

        }

        /*
        Number      Square      Square root
0      0      0.0
1      1      1.0
2      4      1.4142
3      9      1.7321
4      16      2.0
5      25      2.2361
6      36      2.4495
7      49      2.6458
8      64      2.8284
9      81      3.0
10      100      3.1623
11      121      3.3166
12      144      3.4641
13      169      3.6056
14      196      3.7417
15      225      3.873
16      256      4.0
17      289      4.1231
18      324      4.2426
19      361      4.3589
20      400      4.4721
21      441      4.5826
22      484      4.6904
23      529      4.7958
24      576      4.899
25      625      5.0
26      676      5.099
27      729      5.1962
28      784      5.2915
29      841      5.3852
30      900      5.4772
31      961      5.5678
32      1024      5.6569
33      1089      5.7446
34      1156      5.831
35      1225      5.9161
36      1296      6.0
37      1369      6.0828
38      1444      6.1644
39      1521      6.245
40      1600      6.3246
41      1681      6.4031
42      1764      6.4807
43      1849      6.5574
44      1936      6.6332
45      2025      6.7082
46      2116      6.7823
47      2209      6.8557
48      2304      6.9282
49      2401      7.0
50      2500      7.0711

Process finished with exit code 0

         */

    }

