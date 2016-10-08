package first.steps.school.repo.model;

import com.sun.org.apache.xpath.internal.SourceTree;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClassName() {
        return className;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public float getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("Weight value should be > 0. Weight = " + weight);
            return;
        }
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", className='" + className + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    //    todo: put student data structure here
}
