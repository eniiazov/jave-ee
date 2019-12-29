package polymorphism3;

public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public void info(){
        System.out.println("Name: " + getName());
    }

    /// Person p1 = new Person();
    //  Person p2 = new Person();
    // p1.hasSameName(p2);

    public boolean hasSameName(Person otherPerson) {
        return this.getName().equalsIgnoreCase(otherPerson.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
