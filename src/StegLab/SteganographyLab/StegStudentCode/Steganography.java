package StegLab.SteganographyLab.StegStudentCode;
import java.awt.Color;

public class Steganography extends Picture {



public static void clearLow(Pixel p){
    int g = p.getGreen();
    int r = p.getRed();
    int b = p.getBlue();
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
