package first.steps.school.repo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maksym Bondarenko
 * @since 09/10/2016
 */
public class Group {

    private final List<Student> students;

    public Group() {
        students = new ArrayList<Student>();
    }

    public Group(List<Student> inputStudents) {
        students = new ArrayList<Student>(inputStudents);
    }

    public List<Student> getStudents() {
        return new ArrayList<Student>(students);
    }

    public void addStudent(Student student){
        if(student == null){
            System.out.println("Student shouldn't be null");
            return;
        }

        students.add(student);
    }
}
