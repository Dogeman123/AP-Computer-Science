package Prog703s;



    public class Apple extends Computers {
        private String color;
        public Apple(String n,int number,double value,String color) {
            super(n,number,value);
            this.color = color;
        }
        public String getColor() {return color; }
}
