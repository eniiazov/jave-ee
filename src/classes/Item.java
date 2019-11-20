package classes;

public class Item {

    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void info() {
        System.out.println("\nName: " + name);
        System.out.println("Price: " + price);
    }

}
