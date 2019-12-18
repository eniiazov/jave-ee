package interviewPrep;

public class ArmStrong {

    public static boolean isArmstrong(int number) {

        String num = number + "";
        int power = num.length();

        int sum = 0;

        for(int i=0; i < num.length(); i++) {

            int digit = Integer.parseInt(num.charAt(i) + "");
            // 153
            // digit ^ power
            // 1^3 = 1 * 1 * 1
            // 5^3 = 5 * 5 * 5
            sum += Math.pow(digit,power);

        }

        return sum == number;

    }


}
