package polymorphism3;

public class TestClass {

    public static void main(String[] args) {

        HighSchoolStudent student = new HighSchoolStudent("james",20, 10);

        Student student2 = new HighSchoolStudent("james",19, 11);

        Person student3 = new HighSchoolStudent("adam",19, 10);

     //   Syste`m.out.println(student2.getGradeLevel()); -> not compiling
        System.out.println(((HighSchoolStudent)student2).getGradeLevel());

    Person [] people = new Person[3];
    people[0] = student;
    people[1] = student2;
    people[2] = student3;

    for(Person p: people) {
        p.info();
    }



    }
}
