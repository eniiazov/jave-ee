package customExceptions;

public class Driver {

    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException{

        if(name.trim().contains(" ")) {
            throw new RuntimeException(name + " was invalid");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws InvalidLocationException{

        for(int i=0; i < location.length(); i++) {
            if(Character.isDigit(location.charAt(i))) {
                throw new InvalidLocationException(location +  " is not a valid location");
            }
        }

        this.location = location;
    }
}
