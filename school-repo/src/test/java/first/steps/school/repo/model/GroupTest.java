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
    public void TestAddingStudent() {
        List<Student> students1 = new ArrayList<Student>();
        students1.add(new Student("A", "B", "1C", new Date(), 55.f, 170));

        Group myGroup = new Group();
        myGroup.addStudent(new Student("A", "B", "1C", new Date(), 55.f, 170));
        assertEquals(students1.size(), myGroup.getStudents().size());
    }


    @Test
    public void TestAddStudentValidationForNullValue() {
        List<Student> students1 = new ArrayList<Student>();
        students1.add(new Student("A", "B", "1C", new Date(), 55.f, 170));

        Group myGroup = new Group();
        myGroup.addStudent(null);
        assertNotEquals(students1.size(), myGroup.getStudents().size());
    }

    @Test
    public void TestDeleteAllStudents() {
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