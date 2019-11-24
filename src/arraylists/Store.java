package arraylists;

import classes.Item;

import java.util.ArrayList;

public class Store {

    String name;
    String address;
    int numberOfItems;
    ArrayList<Item> items = new ArrayList<>();

    public Store(String name, String address){
        this.name = name;
        this.address = address;
    }


    public void addItem(Item item){
        this.items.add(item);
        this.numberOfItems++;
    }



    public void seeInventory(){
        for(Item item: items){
            item.info();
        }
    }



}
