package arrays;

public class beginWithUppercase {
    public static void main(String[] args) {
        //"Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
        String [] items = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count = 0;
        for(String item: items) {

            char start = item.charAt(0);
            // if(Character.isUpperCase(start)); -> method takes character
            if(Character.isUpperCase(start)) {
                count++;
                System.out.println(item);
            }

//            if(start >= 65 && start <= 90) {
//                count++;
//            }

        }
        System.out.println(count);

    }
}
