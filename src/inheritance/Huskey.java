package inheritance;

import classes.Item;
import inheritance.Dog;

public class Huskey extends Dog implements Trainable{
    @Override
    public void fetch(Item item) {
        System.out.println("Huskey is fetching " + item.name);
    }

    @Override
    public void play() {

    }

    @Override
    public void barkOnCommand() {

    }

    String furType;

    public void liveInCold(){
        System.out.println("Huskey is living in the cold weather!");
    }

}
