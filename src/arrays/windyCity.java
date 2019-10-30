package arrays;

public class windyCity {
    public static void main(String[] args) {
        //Chicago, New York, Madison, Miami, Washington
        String [] cities = { "New York", "Madison","Chicago", "Miami", "Washington", "Chicago"};

        boolean check = false;
        int count = 0;

        for(String city: cities) {
            if(city.equalsIgnoreCase("Chicago")) {
                check = true;
                count++;
            }
        }

        if(check) {
            System.out.println("Windy city found " + count + " times");
        } else {
            System.out.println("Windy city not found");
        }




    }
}
