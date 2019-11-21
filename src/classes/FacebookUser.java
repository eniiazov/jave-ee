package classes;

public class FacebookUser {

    String userName;
    String password;
    String name;
    int age;
    int numOfFriends;

    public FacebookUser(String userName, String password) {
        this.userName= userName;

        if(password.contains(userName)) {
            System.out.println("Invalid password");
            this.password= "password";
        } else{
            this.password = password;
        }
    }

    public FacebookUser(String userName, String password, String name) {
        this(userName,password);

        name = name.replace(" ","");

        boolean valid = true;

        for(int i=0; i < name.length(); i++) {
            if(!Character.isLetter(name.charAt(i)))  {
                valid = false;
                break;
            }
        }

        if(valid) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "no name";
        }

    }

    public FacebookUser (String userName, String password, String name, int age, int numOfFriends){

        this(userName,password,name);

        if(age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }

        if(numOfFriends < 0 || numOfFriends > 5000) {
            System.out.println("Invalid number of friends");
        } else {
            this.numOfFriends = numOfFriends;
        }

    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Username: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Number of friends: " + numOfFriends);
    }

    public boolean sendFriendRequest(FacebookUser userTwo) {

        if(this.numOfFriends >= 5000) {
            System.out.println("You reached the limit");
            return false;
        } else if(userTwo.numOfFriends >= 5000) {
            System.out.println(userTwo.name + " has reach the limit of friends");
            return false;
        } else {
            System.out.println("Request sent");
            this.numOfFriends++;
            userTwo.numOfFriends++;
            return true;
        }


    }














}
