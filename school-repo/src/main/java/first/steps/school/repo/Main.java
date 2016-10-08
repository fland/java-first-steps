package first.steps.school.repo;

import first.steps.school.repo.model.Student;

import java.util.Date;

/**
 * @author Maksym Bondarenko
 * @since 06/10/2016
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        System.out.println(student.getFirstName());
    }


}

