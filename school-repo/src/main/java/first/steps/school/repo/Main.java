package first.steps.school.repo;

import com.sun.org.apache.xpath.internal.SourceTree;
import first.steps.school.repo.model.Group;
import first.steps.school.repo.model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Maksym Bondarenko
 * @since 06/10/2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        System.out.println(student.getFirstName());
        student.setClassName("B2");
        System.out.println(student);
        student.setHeight(150);
        System.out.println(student);
        student.setHeight(-10);
        System.out.println(student);
        student.setHeight(300);
        System.out.println(student);

        Group group = new Group();
        System.out.println(group.getStudents());
        group.addStudent(new Student("A", "B", "1B", new Date(), 15.f, 156));
        System.out.println(group.getStudents());
        List<Student> students = group.getStudents();
        System.out.println(students);
        students.get(0).setFirstName("Vasya");
        System.out.println(students);
        System.out.println(group.getStudents());

        List<Student> students1 = new ArrayList<Student>();
        students1.add(new Student("B", "c", "1a", new Date(), 55.f, 180));
        Group group1 = new Group(students1);
        System.out.println(group1.getStudents());
        students1.clear();
        System.out.println(group1.getStudents());

        Group group2 = new Group();
        group2.addStudent(new Student("A2", "B2", "2B", new Date(), 57.f, 172));
        System.out.println(group2.getStudents());
        group2.deleteAllStudents();
        System.out.println(group2.getStudents());

        group2.addStudent(new Student("0A", "0B", "0C", new Date(), 57.f, 172));
        group2.addStudent(new Student("1A", "1B", "1C", new Date(), 57.f, 172));
        group2.addStudent(new Student("2A", "2B", "2C", new Date(), 57.f, 172));
        System.out.println(group2.getStudents());
        group2.deleteStudentByIndex(0);
        System.out.println(group2.getStudents());
        group2.deleteStudentByIndex(0);
        System.out.println(group2.getStudents());


    }


}

