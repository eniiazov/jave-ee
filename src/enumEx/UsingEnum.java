package enumEx;


public class UsingEnum {
    public static void main(String[] args) {

//       LetterGrade grade = LetterGrade.B;
////
////        getGrade(grade);
            getGrade(LetterGrade.A);
    }

    public static void getGrade(LetterGrade grade){
        switch (grade) {
            case A:
                System.out.println("You got an A");
                break;
            case B:
                System.out.println("Not bad");
                break;
            case C:
                System.out.println("You could do better");
                break;
            case D:
                System.out.println("Not so good");
                break;
            case F:
                System.out.println("You failed");

        }
    }
}
