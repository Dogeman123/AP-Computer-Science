public class GenericsAndTernary {
    //Generic Typing
    static class myBox<T>{ //Define templete type "T"
        private T myVal;

        public myBox(T thing){ myVal = thing; }
        public void setVal(T thing) { myVal = thing;}
        public T getVal() { return myVal;}
    }

    public static void main(String[] args) {
        // ArrayList<TYPE> list = new ArrayList<TYPE>();
        var box = new myBox<Integer>(5);
        String msg = (box.getVal() >= 5 ) ? "val >= 5" : "val < 5";
        //Ternary Operator -> (Condition) "If" ... "else"...
        System.out.println(msg);
        box.setVal(10);
        System.out.println(box.getVal());
        // box.setVal("Hello"); wont work because of the set integer Value
        var sBox = new myBox<String>("hello");
        System.out.println(sBox.getVal());
        // ONLY EVER USE "VAR" IF YOU USE THE "NEW" KEYWORD
        // AND THE TYPE IS NOT A CHILD CLASS OR USES AN INTERFACE
        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                //break;
            // break prevents you from falling into
            //the case below;
            default: // Else
                System.out.println("Invalid");
                break;
        }
    }
}
