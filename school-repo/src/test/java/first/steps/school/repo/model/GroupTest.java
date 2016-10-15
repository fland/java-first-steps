package first.steps.school.repo.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asya on 10.10.16.
 */
public class GroupTest {

    @Test
    public void testAddStudentOneStudent() {
        Group group = new Group();
        assertTrue(group.getStudents().isEmpty());
        Student expectedStudent = new Student("A", "B", "1C", new Date(), 55.f, 170);
        group.addStudent(expectedStudent);
        assertTrue(group.getStudents().contains(expectedStudent));
        assertEquals(1, group.getStudents().size());
    }

    @Test
    public void testAddStudentSeveralStudents() {
        Group group = new Group();
        assertTrue(group.getStudents().isEmpty());
        List<Student> expectedStudents = new ArrayList<Student>();
        Student student = new Student("A", "B", "1C", new Date(), 55.f, 170);
        group.addStudent(student);
        expectedStudents.add(student);
        student = new Student("1A", "1B", "2C", new Date(), 33.f, 150);
        group.addStudent(student);
        expectedStudents.add(student);
        student = new Student("2A", "2B", "3C", new Date(), 44.f, 180);
        group.addStudent(student);
        expectedStudents.add(student);
        assertTrue(group.getStudents().containsAll(expectedStudents));
        assertTrue(expectedStudents.containsAll(group.getStudents()));
    }


    @Test
    public void testAddStudentAddingNullValue() {
        Group group = new Group();
        assertTrue(group.getStudents().isEmpty());
        group.addStudent(null);
        assertTrue(group.getStudents().isEmpty());
    }

    @Test
    public void testDeleteAllStudents() {
        Group myGroup = new Group();
        myGroup.addStudent(new Student("0A", "B", "1C", new Date(), 55.f, 170));
        myGroup.addStudent(new Student("1A", "B", "1C", new Date(), 55.f, 170));
        myGroup.deleteAllStudents();
        assertEquals(0, myGroup.getStudents().size());

    }

    @Test
    public void deleteStudentByIndex() {


    }

}