package polymorphism3;

public class HighSchoolStudent extends Student{
    private int gradeLevel;

    public HighSchoolStudent(String name, int number, int gradeLevel) {
        super(name,number);
        setGradeLevel(gradeLevel);
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Grade level: " + getGradeLevel());
    }

    public void setGradeLevel(int gradeLevel) {
        if(gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        } else {
            System.out.println("Invalid grade level");
            System.exit(0);
        }

    }

    public boolean equals(HighSchoolStudent otherStudent) {
      return super.equals(otherStudent) && this.getGradeLevel() == otherStudent.getGradeLevel();
    }



}
