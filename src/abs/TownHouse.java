package abs;

public class TownHouse extends Home {

    public void shareWithNeighbor(){
        System.out.println("Sharing is caring");
    }

    @Override
    public void throwAParty() {
        System.out.println("Party at TownHouse");
    }

    @Override
    public void lock() {
        System.out.println("Locking the townhouse");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the townhouse");
    }

    @Override
    public void cook() {
        System.out.println("Cooking at townhouse");
    }
}
