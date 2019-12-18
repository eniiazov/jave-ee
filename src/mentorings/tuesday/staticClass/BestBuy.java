package mentorings.tuesday.staticClass;

public class BestBuy {

    String location;
    static int numOfComputers;
    static String day;
    static int employees;


    public BestBuy(String location) {
        this.location = location;
    }

    static  {
        numOfComputers = 50;
        System.out.println("run first");
        day = "tuesday";
    }

    static {
        System.out.println("Run 2nd");
        if(day.equals("monday")) {
            numOfComputers = 60;
        } else{
            numOfComputers= 20;
        }
    }


    public static void printComputer() {
        System.out.println(numOfComputers);
    }

    static {

    }

}
