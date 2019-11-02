package methods;

public class timePrint {
    public static void main(String[] args) {
        printTheTime(0,50,true);
    }

    public static void printTheTime(int hour, int minutes, boolean amOrPM) {

        if((hour > 0 && hour < 13) && (minutes >= 0 && minutes < 60)) {

            String date = hour + " : " + minutes;

            if(amOrPM) {
                date += " AM";
            } else {
                date += " PM";
            }

            System.out.println(date);



        } else {
            System.out.println("Invalid data");
        }

    }



}
