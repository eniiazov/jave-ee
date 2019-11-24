package arraylists;

import classes.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    String name;
    String address;
    int numberOfItems;
    ArrayList<Item> items = new ArrayList<>();
    double totalSales;

    public Store(String name, String address){
        this.name = name;
        this.address = address;
    }


    public void addItem(Item item){
        this.items.add(item);
        this.numberOfItems++;
    }

    public void addItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items to enter:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quantity; i++){
            System.out.println("Enter name for item#" + (i+1));
            String name = scanner.nextLine();
            System.out.println("Enter price for item#" + (i+1));
            double price = scanner.nextDouble();
            scanner.nextLine();

            Item item = new Item(name, price);
            this.items.add(item);
            this.numberOfItems++;
        }
    }

    public void sellItem(String itemName){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).name.equals(itemName)){
                this.totalSales += items.get(i).price;
                items.remove(i);
                System.out.println("\nSuccessful transaction! Thank you for the money");
                this.numberOfItems--;
                return;
            }
        }
        System.out.println("Item is not in stock");
    }

    public void returnItem(String itemName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of the returned item:");
        double itemPrice = scanner.nextDouble();
        Item item = new Item(itemName, itemPrice);
        items.add(item);
        this.totalSales -= itemPrice;
        this.numberOfItems++;
        System.out.println("\nReturn process successful.");
    }


    public void seeInventory(){
        System.out.println("\nZARA Chicago Store");
        System.out.println("Total sales: " + this.totalSales + " $");
        for(Item item: items){
            item.info();
        }
    }



}
