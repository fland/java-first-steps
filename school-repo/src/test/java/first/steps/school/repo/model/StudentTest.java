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

}