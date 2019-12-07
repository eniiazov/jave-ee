package accessModifiers;

public class Person {

    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            this.gender = gender;
        }
        else {
            System.out.println("Invalid gender entered. Please try again!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 120){
            this.age = age;
        }
        else {
            System.out.println("Invalid age entered");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0){
            this.height = height;
        }
        else {
            System.out.println("Invalid Height entered");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0){
            this.weight = weight;
        }
        else{
            System.out.println("Invalid weight entered");
        }

    }
}
