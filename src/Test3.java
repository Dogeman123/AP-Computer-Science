// Michael Verdin

//Test3

//10/4/22

public class Test3 {
    public static void main(String[] args) {
        String text = "BeAuTiFul beAch".toLowerCase();
        //for (int lcv = text.length() - 1; lcv >= 0; lcv--) {}

        for (int lcv = text.length(); lcv-- > 0; ) {
            String chr = text.substring(lcv, lcv + 1);
            if (chr.equals("a") || chr.equals("e") || chr.equals("i") ||
                    chr.equals("o") || chr.equals("u"))
            System.out.print(chr);
         else System.out.print(" ");
        }

           System.out.println();
    }
}
/*
  ae   u i uae
 */