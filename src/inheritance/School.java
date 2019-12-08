package inheritance;

public class School {

    String name;
    String address;
    String type;

    public void giveHW(){
        System.out.println(this.name + " is giving the HW");
    }

    public void hostEvent(String date){
        System.out.println(this.name + " is hosting an Event on " + date);
    }
}
