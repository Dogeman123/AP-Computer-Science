package S1;

import java.util.Formatter;

// Michael Verdin
//10/24/22
// Prog285bCl
public class Salesperson {
    private int myId;
    private int myCode;
    private double mySales;
    private double myComm;
    //  public static double PI =3.14159

    public Salesperson(int id, int code, double sales){
        myId = id;
        myCode= code;
        mySales = sales;
        myComm = 0;

    }
    public void setcomm(){
        if(myComm == 5 || myComm ==8){
            if(mySales<= 5000){
                myComm = getSales() * 0.075;
            }else {
                myComm = 5000 * 0.075 +(mySales - 5000) * 0.085;
            }

            }else if (myComm==17){
                if(mySales<=3500){
                   myComm = mySales * 0.095;
                   // getComm( = getSales() * 0.095;
                }else {
                    myComm= mySales= 3500 * 0.095 + (getSales()-3500 * 0.12);
                }
            }
        }
        public int getId(){return myId;}
    public int  getCode() {return myCode;}
    public double getComm() {return myComm;}
    public double getSales() {return mySales;}

    public String toString() {
        return myId + "\t" + myCode + "\t" + mySales + "\t" + myComm;

    }
    }


