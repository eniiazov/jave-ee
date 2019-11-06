package methods;

public class overLoading {

    public static void main(String[] args) {
        jump(6);
        jump();
        jump(5);
        String [] arr = {"d"};
        System.out.println(jump(arr));
    }

    public static void jump() {
        System.out.println("You dont get far");
    }

    public static void jump(String shoes) {
        System.out.println("The shoes made you go farther");
    }

    public static void jump(int distance) {
        System.out.println("You jumped " + distance);
    }

    public static String jump(String [] arr) {
        return arr[0];
    }

    public static String jump(int [] arr) {
        return "jumped by array";
    }


}
