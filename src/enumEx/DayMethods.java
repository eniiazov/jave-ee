package enumEx;

public class DayMethods {

    public static void main(String[] args) {
        checkDay(DaysInTheWeek.WEDNESDAY);
    }

    public static void checkDay(DaysInTheWeek day)  {

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekends are the best");
                break;
                default:
                    System.out.println("Regular days are okay");
        }


    }


}
