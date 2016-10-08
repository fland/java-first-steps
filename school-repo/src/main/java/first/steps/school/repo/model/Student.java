package first.steps.school.repo.model;

import java.util.Date;

/**
 * @author Maksym Bondarenko
 * @since 06/10/2016
 */
public class Student {

    private String firstName, lastName, className;
    private Date birthDate;
    private Double hight, weight;

    public Student(String firstName, String lastName, String className, Date birthDate, Double hight, Double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.birthDate = birthDate;
        this.hight = hight;
        this.weight = weight;
    }

//    todo: put student data structure here
}
