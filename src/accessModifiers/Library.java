package accessModifiers;

import classes.Author;
import utilities.MyCollection;

public class Library {

    public static void main(String[] args) {
        Author author = new Author();
        author.name = "James";
//        MyCollection.getStringList();
//        Person person = new Person("Jason");
//        System.out.println(person.name);
//
        Person person1 = new Person();



        // Why? Because access modifier
        // author object doesn't have access to variable 'name'.
        // Author class is located in the different package than Library class.


    }
}
