package mentorings.tuesday;

public class Student {

    public String firstName;
    public String lastName;
    protected int age;
    static boolean isActive;

    public String info() {
        return String.format("firstName = %s,\nlastName = %s,\nage = %s,\nisActive = %s"
                ,firstName,lastName,age,isActive);
    }

    @Override
    public String toString() {
        return String.format(
                "firstName = %s,\nlastName = %s,\nage = %s,\nisActive = %s"
                ,firstName,lastName,age,isActive
        );
    }
}
