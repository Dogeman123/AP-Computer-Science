//Michael Verdin
// Prog54bClass

public class Cl54b {
    private int myNum;
    private int myNum2;
    private int mynum3;
    private int myNum4;
    private int sum;
    private double average;

    public Cl54b(int Num,int Num2 , int Num3,int Num4){
           myNum = Num;
           myNum2 = Num2;
           mynum3 = Num3;
           myNum4 = Num4;
           sum = Num + Num2 + Num3 + Num4;
            average = sum/4;
        }


        public void setStuff(){

        }
        public int getNum() {return myNum; }
        public int getMyNum2() {return myNum2;}
        public  int getMynum3() {return mynum3;}
    public int getSum() { return sum;}
    public double getAverage() {return average;}
}
