public class CllP9 {
    private int myyear;
    private int myMonth;
    private int myday;

    private int alive;
    private int sleep;

    private int myyear2;
    private int myMonth2;
    private int myday2;

    public CllP9(int year , int Month,int day,int year2,int Month2,int day2) {
        myyear = year;
        myMonth = Month;
        myday = day;
        myyear2 = year2;
        myMonth2 = Month2;
        myday2 = day2;

        alive = (year2-year)*(365) + (myMonth2-myMonth);



    }
}
