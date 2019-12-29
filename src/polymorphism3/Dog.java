package polymorphism3;

public class Dog extends Animal{
    boolean isMale;

    @Override
    public void breath() {
        System.out.println("Dog is breathing");
    }

}
