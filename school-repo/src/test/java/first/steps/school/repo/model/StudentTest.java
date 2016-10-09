package first.steps.school.repo.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by asya on 08.10.16.
 */
public class StudentTest {

    @Test
    public void testSetFirstNameValidValue() {
        Student student = new Student("Anastasiia", "Mor", "B1", new Date(), 60, 170);
        assertEquals("Anastasiia", student.getFirstName());
        student.setFirstName("Mariia");
        assertEquals("Mariia", student.getFirstName());
    }

    @Test
    public void testSetFirstNameLongValue() {
        Student student = new Student("Anastasiia", "Mor", "B1", new Date(), 60, 170);
        assertEquals("Anastasiia", student.getFirstName());
        student.setFirstName("Anna Bertha Cecilia Diana Emily Fanny Gertrude Hypatia");
        assertEquals("Anastasiia", student.getFirstName());
    }

    @Test
    public void testSetLasttNameValidValue() {
        Student student = new Student("Asya", "Mordovets", "B1", new Date(), 60, 170);
        assertEquals("Mordovets", student.getLastName());
        student.setLastName("Johnson");
        assertEquals("Johnson", student.getLastName());
    }

    @Test
    public void testSetLastNameLongValue() {
        Student student = new Student("Asya", "Mordovets", "B1", new Date(), 60, 170);
        assertEquals("Mordovets", student.getLastName());
        student.setLastName("Testtesttest-testetstetstetstestetstes");
        assertEquals("Mordovets", student.getLastName());
    }

    @Test
    public void testSeClassNameValidValue() {
        Student student = new Student("Asya", "Mordovets", "B1", new Date(), 60, 170);
        assertEquals("B1", student.getClassName());
        student.setClassName("A9");
        assertEquals("A9", student.getClassName());
    }

    @Test
    public void testSeClassNameInvalidValue() {
        Student student = new Student("Asya", "Mordovets", "B1", new Date(), 60, 170);
        assertEquals("B1", student.getClassName());
        student.setClassName("A10");
        assertEquals("B1", student.getClassName());
    }

    @Test
    public void testSetWeightValidValue() {
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(60, student.getWeight(), 0.001);
        student.setWeight(50);
        assertEquals(50, student.getWeight(), 0.001);
    }

    @Test
    public void testSetWeightNegativeValue(){
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(60, student.getWeight(), 0.001);
        student.setWeight(-10);
        assertEquals(60, student.getWeight(), 0.001);
    }

    @Test
    public void testSetWeightZeroValue(){
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(60, student.getWeight(), 0.001);
        student.setWeight(0);
        assertEquals(60, student.getWeight(), 0.001);
    }

    @Test
    public void testSetHeightValidValue() {
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(170, student.getHeight());
        student.setHeight(100);
        assertEquals(100, student.getHeight());
    }

    @Test
    public void testSetHeightNegativeValue() {
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(170, student.getHeight());
        student.setHeight(-1);
        assertEquals(170, student.getHeight());
    }

    @Test
    public void testSetHeightZeroValue() {
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(170, student.getHeight());
        student.setHeight(0);
        assertEquals(170, student.getHeight());
    }

    @Test
    public void testSetHeightUpperBoundaryValue() {
        Student student = new Student("Asya", "Mor", "B1", new Date(), 60, 170);
        assertEquals(170, student.getHeight());
        student.setHeight(301);
        assertEquals(301, student.getHeight());
    }


}