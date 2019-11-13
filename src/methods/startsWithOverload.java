package methods;

public class startsWithOverload {
    public static void main(String[] args) {
        System.out.println(checkString("Djamesjajl","ja", 2));
    }

    public static boolean checkString(String word, String start) {
        return word.toLowerCase().startsWith(start.toLowerCase());
    }

        // input: “Djamesjajl”,”ja", 2

    public static boolean checkString(String word, String start, int times) {

        int count = 0;

        for(int i=0; i < word.length() - start.length() + 1 ; i++) {

            String sub = word.substring(i, i + start.length());
         //   System.out.println(sub);
            if(sub.equals(start)) {
                count++;
            }

        }

        if(times == count) return true;

        return false;

    }



}
