package stringBuilder;

public class SBMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Car");
        //sb.deleteCharAt(1);
        sb.reverse();
        sb.delete(0,2);
        sb.insert(0,"Hello");
        System.out.println(sb);
    }
}
