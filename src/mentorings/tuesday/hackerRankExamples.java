package mentorings.tuesday;

public class hackerRankExamples {


    public static void main(String[] args) {

        buildQuery();

    }

    public static void buildQuery() {

        int a = 5;
        int b = 3;
        int n = 5;

        int s = a;

        for (int i = 0; i < n; i++) {
            s += Math.pow(2, i) * b;
            System.out.print(s + " ");
        }
    }

}
