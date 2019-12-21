package abs;

public class SingleHouse extends Home {

    String garageType;

    public void cutGrass(){
        System.out.println("Cutting the grass at Single House");
    }

    public void shovelSnow(){
        System.out.println("Shoveling the snow in Single House");
    }

    @Override
    public void throwAParty() {
        System.out.println("Single house party");
    }

    @Override
    public void lock() {
        System.out.println("locking single house");
    }

    @Override
    public void unlock() {
        System.out.println("unlcoking single house");
    }

    @Override
    public void cook() {
        System.out.println("cooking at single house");
    }

    @Override
    public String toString(){
        String result = super.toString() + "\nGarage type: " + this.garageType;
        return result;
    }

}
