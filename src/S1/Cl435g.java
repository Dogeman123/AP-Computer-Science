package S1;

// Michael Verdin
// Prog435g
// 11/10/22
public class Cl435g {
    private int myScore;
    private int myRank;

    public Cl435g(int score){
        myRank = 0;
        myScore = score;

    }

    public int getScore() { return myScore;}
    public int getRank() { return myRank; }
    public void setMyRank(int rank) { myRank = rank;}
    public String toString() { return myScore + "\t\t" + myRank;}
}
