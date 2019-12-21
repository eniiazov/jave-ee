package abs;

public abstract class Home {

    String address;
    int maxNumOfGuests;
    int numOfRooms;

    public abstract void throwAParty();

    public abstract void lock();

    public abstract void unlock();

    public abstract void cook();

    @Override
    public String toString(){
        String result = "Address: " + this.address + "\nNumber of Guests: " + this.maxNumOfGuests +
                "\nNumber of rooms: " + this.numOfRooms;
        return result;
    }



}
