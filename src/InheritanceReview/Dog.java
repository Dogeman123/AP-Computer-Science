package InheritanceReview;

public class Dog extends Animal {
    private String myColor;

    public Dog(int age, String name, String Color){
        super(age,name);
        myColor = Color;
    }

    @Override //Change implementation change what's inside the method
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }
    //overload  Add new argument or implementation
    public void speak(String word){
        System.out.println(word);
    }

    //New method
    public void bark(){
        System.out.println("Bark!");
    }
    public String toString(){
        return "Age: " + super.getAge() +
                "\nName: " + super.getName() +
                "\nColor: " +myColor;

    }
}
