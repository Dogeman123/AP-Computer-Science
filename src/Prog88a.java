public class Prog88a {
// michael verdin
    //09/14/22
    public static void main(String[] args) {
            // Enter number 1-13
            //Enter number 2-20
            //math.random()* (man-min) + min
            int num1 = (int) (Math.random() * (13 - 1)) + 1;
            int num2 = (int) (Math.random() * (20 - 2)) + 2;
            int min = num1;
            int sum = num2 + num1;
            int dif = num1 - num2;
            int ave = (num1 + num2)/2;



            int prod = num1 * num2;

            int max;

            if (num1 > num2) {
                max = num1;
            } else {
                max = num2;

                if (max == num1) {
                    min = num2;
                } else {
                    min = num1;
                }
            }
            System.out.println("The original numbers are " + num1 + "and " + num2);
            System.out.println("The sum is " + sum);
            System.out.println("The product is " + prod);
            System.out.println("The average is " + ave);
            System.out.println("The absolute min is " + min );
            System.out.println("The absolute max is " + max);

        }
    }

