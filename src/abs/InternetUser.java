package abs;

public class InternetUser {

    public static void main(String[] args) {

        SingleHouse sh = new SingleHouse();
        sh.garageType = "Regular";
        sh.address = "132 main st";
        sh.numOfRooms = 5;
        sh.maxNumOfGuests = 40;

        sh.cook();
        sh.cutGrass();
        System.out.println(sh);

    }
}
