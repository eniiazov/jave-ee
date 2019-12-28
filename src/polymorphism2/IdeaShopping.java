package polymorphism2;

public class IdeaShopping {

    public static void main(String[] args) {

        Chair c = new Aeron();
        c.sit();
        // Casting in Polymorphism: switching from Chair to Aeron type. Because it is
        // allowed normally
        Aeron a = new Aeron();
        HumanScale co = new HumanScale();


    }
}
