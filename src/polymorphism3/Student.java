package polymorphism3;

public class Student extends Person {

    private int studentNumber;

    public Student(String name, int number) {
        super(name);
        setStudentNumber(number);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Student Number: " + getStudentNumber());
    }

    //     Student s1 = new Student();
    //     Student s2 = new Studnet();
    //       s1.equals(s2)

    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent) && this.getStudentNumber() == otherStudent.getStudentNumber();
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

}
