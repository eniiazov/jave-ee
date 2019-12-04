package mentorings.tuesday;

import com.sun.deploy.panel.AbstractRadioPropertyGroup;

import java.util.ArrayList;

public class BaseClass {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.firstName = "Mike";
        student1.lastName = "Snyder";
        student1.age = 21;
        student1.isActive = true;

        Student student2 = new Student();
        student2.firstName = "John";
        student2.lastName = "Paul";
        student2.age = 24;
        student2.isActive = false;

        Student student3 = new Student();
        student3.firstName = "Eric";
        student3.lastName = "Peterson";
        student3.age = 23;
        student3.isActive = true;

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students)
            if (student.isActive)
                System.out.println(student.info() + "\n");
    }
}
