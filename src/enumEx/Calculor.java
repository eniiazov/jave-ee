package enumEx;

public class Calculor {
    public static void main(String[] args) {
        System.out.println(calculator(Operators.REM, 3,0));
    }

    public static double calculator(Operators op, double num, double num2) {
        switch (op) {
            case ADD:
               return num + num2;
            case MINUS:
                return num - num2;
            case MULTI:
                return num * num2;
            case DIV:
                if(num2 == 0) {
                    System.out.println("You cannot divide by 0");
                    return 0;
                }
                return  num / num2;

            case REM:
                if(num == 0 || num2 == 0) {
                    System.out.println("Invalid remainder operation");
                    return 0;
                }
                return  num % num2;
        }
        return 0;
    }

}
