package polymorphism2;

public abstract class Chair {

    // model, weight, color
    String model;
    double weight;
    String color;

    // void sit, void stepOnIt
    public abstract void sit();

    public abstract void stepOnIt();

    public void changeColor(String color){
        this.color = color;
    }

}
