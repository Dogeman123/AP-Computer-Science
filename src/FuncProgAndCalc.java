import java.awt.geom.Arc2D;
import java.util.function.Function;

public class FuncProgAndCalc {
    public static double f(double x) {
        return Math.pow(x, 3);
    } //f(x) = x^3

    public static double derive(Function<Double, Double> f, double x) {
        final double h = 0.0000001;
        return (f(x + h) - f(x)) / h;
    }

    public static double derive(Function<Double, Double> x, double h) {
        return (f(x + h) - f(x)) / h;
    }

    public static double deriveN(Function<Double, Double> f, double x, int n){
        final double h = 1/Math.pow(10,n);
        if(n == 1) return derive(f,x);
        else return deriveN(f, x+h, n-1) - deriveN(f,x, n-1)/h;
    }


    public static double intergrate(Function<Double,Double> f, double a, double b, int n) {
        double sum = 0;
        double deltaX = (b - a) / n;
        for (int i = 0; i < n; i++) {
            sum += f(((a + i * deltaX) + (a + (i + 1) * deltaX)) / 2) * deltaX;
        }
            return sum;
    }

    public static void main(String[] args) {
        double x =5;
        System.out.println("x = " + x);
        System.out.println("F(x) = " + f(x));
        System.out.println("f' (x) using power rule = " + (3 * Math.pow(x,2)));
        System.out.println("f' (x) using def = " + derive(FuncProgAndCalc::f,x));
        System.out.println("f'' (x) = " + deriveN(FuncProgAndCalc::f,x,2));
        System.out.println("f''' (x) = " + deriveN(FuncProgAndCalc::f,x,3));
        //====================
        double a = 1;
        double b = 5;
        int n = 100_000_000;
        System.out.printf("a = %f\tn = %f\n", a,b);
        System.out.println("f(x) = " + f(b-a));
        System.out.println("F(x) using power rule = " +((Math.pow(b,4)/4)-Math.pow(a,4)/4));
        System.out.println("F(x) using def = " + intergrate(FuncProgAndCalc::f,a,b,n));
    }
}
