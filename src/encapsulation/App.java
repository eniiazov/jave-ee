package encapsulation;

import java.util.ArrayList;

public class App extends Object {

    // name, category, rating, description, size, list of reviews.
    private String name;
    private String category;
    private double rating;
    private String description;
    private double size;
    private ArrayList<String> reviews;
    private static int numOfApps;

    public App(String name, String category, double size){
        this.name = name;
        this.category = category;
        this.size = size;
        numOfApps++;
        this.reviews = new ArrayList<>();
    }

    public App(){

    }

    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Category: " + this.category);
        System.out.println("Size: " + this.size);
        System.out.println("Rating: " + this.rating);
        System.out.println("Description: " + this.description);
    }

    public static int getNumOfApps(){
        return numOfApps;
    }

    public void open(){
        System.out.println(this.name + " is opening!");
    }

    public void close(){
        System.out.println(this.name + " is closing!");
    }

    public void update(){
        System.out.println(this.name + " is updating!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReview(String review) {

        if(review.length() >= 3){
            this.reviews.add(review);
            System.out.println("Thank you for leaving us a Review!");
        }
        else{
            System.out.println("Sorry your review is invalid! Try again!");
        }
    }
}











