package methods;

public class sumNumbers {
    public static void main(String[] args) {


        String str = "aa11b33";

        int sum = 0;
        out: for(int i=0; i < str.length(); i++){
              if(i == str.length()-1) break out;
            if(Character.isDigit(str.charAt(i))) {
                String temp = "";
                temp += str.charAt(i);
                for(int j = i+1; j < str.length(); j++) {


                    if(Character.isDigit(str.charAt(j))) {

                        temp += str.charAt(j);
                    } else {

                        i = j;
                        break;
                    }

                }

                sum += Integer.valueOf(temp);
            }


        }
        System.out.println(sum);
    }


}
