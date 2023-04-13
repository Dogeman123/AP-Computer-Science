package S1;

public class Prog166f {

        public static void main(String[] args) {
            int num = 99;
            int sum = 0;
            while(num < 110){
                num +=1;

                sum = num/2*(2*1+(num-1));
                System.out.println("The sum of the numbers between 1 and "+ num + " is " + sum);
            }

        }
    }
/*
The sum of the numbers between 1 and 100 is 5050
The sum of the numbers between 1 and 101 is 5100
The sum of the numbers between 1 and 102 is 5253
The sum of the numbers between 1 and 103 is 5304
The sum of the numbers between 1 and 104 is 5460
The sum of the numbers between 1 and 105 is 5512
The sum of the numbers between 1 and 106 is 5671
The sum of the numbers between 1 and 107 is 5724
The sum of the numbers between 1 and 108 is 5886
The sum of the numbers between 1 and 109 is 5940
The sum of the numbers between 1 and 110 is 6105
*/


