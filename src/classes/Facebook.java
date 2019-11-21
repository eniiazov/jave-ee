package classes;

public class Facebook {
    public static void main(String[] args) {
        FacebookUser obj1 = new FacebookUser("james","pass");
        FacebookUser obj2 = new FacebookUser("adam123","pass","adam");
        obj1.numOfFriends = 500;
        obj2.numOfFriends= 5000;

        System.out.println( obj1.sendFriendRequest(obj2));
    }
}
