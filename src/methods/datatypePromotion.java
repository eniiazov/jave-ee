package methods;

public class datatypePromotion {

    public static void main(String[] args) {
        float a = 45;
        int b = 5;
        calc(a);
        calc(b);
    }

    public static void calc(int i) {
        System.out.println("using int");
    }


    public static void calc(long l) {
        System.out.println("using long");
    }

    public static void calc(float f) {
        System.out.println("using float");
    }

}
