package StegLab.SteganographyLab.StegStudentCode;
import java.awt.Color;

public class Steganography {



    //Clear the right most
public static void clearLow(Pixel p) {

}

    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();
    }

    public static Picture testClearLow(Picture p) {
  return p;
    }
}
