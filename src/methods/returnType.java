package methods;

public class returnType {
    public static int getThree() {
        return 3;

    }

    public static String getDate(String date) {

        return date.replace("/","");

    }


    public static void main(String [] args) {
        int a = getThree() + 7;

        System.out.println(a);

        String date = getDate("11/02/2019");
        System.out.println(date);

    }
}
