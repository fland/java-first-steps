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
        if (firstName.length() > 50) {
            throw new IllegalArgumentException("First Name should contain less than 50 characters. First Name: [" + firstName + "]; length = " + firstName.length());
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 30) {
            throw new IllegalArgumentException("Last Name should contain less than 30 characters. Last Name: [" + lastName + "]; length = " + lastName.length());
        }
        this.lastName = lastName;
    }

    public void setClassName(String className) {
        if (className.length() != 2) {
            throw new IllegalArgumentException("Class should contain only 2 characters. Class: [" + className + "]");
        }
        this.className = className;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setWeight(float weight) {
        if (weight <= 0 || weight > 200) {
            throw new IllegalArgumentException("Weight value should be between 0 and 200 kg. Weight = " + weight);
        }
        this.weight = weight;
    }

    public void setHeight(int height) {
        if (height <= 0 || height > 300) {
            throw new IllegalArgumentException("Height value should be between 0 and 300. Height = " + height);
        }
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
}
