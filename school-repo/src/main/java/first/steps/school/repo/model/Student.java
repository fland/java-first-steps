package first.steps.school.repo.model;

import java.util.Date;

/**
 * @author Maksym Bondarenko
 * @since 06/10/2016
 */
public class Student {

    private String firstName;
    private String lastName;
    private String className;
    private Date birthDate;
    private float weight;
    private int height;

    public Student(String firstName, String lastName, String className, Date birthDate, float weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    //    todo: put student data structure here
}
