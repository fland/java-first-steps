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

    public Group(List<Student> students) {
        this.students = new ArrayList<Student>(students);
    }

    public List<Student> getStudents() {
        return new ArrayList<Student>(students);
    }

    public void addStudent(Student student) {
        if (student == null) {
            System.out.println("Student shouldn't be null");
            return;
        }
        students.add(student);
    }

    public void deleteAllStudents() {
        students.clear();
    }

    public void deleteStudentByIndex(int index) {
        if (index < 0) {
            System.out.println("Index should be >= 0. Index = [" + index + "]");
            return;
        }
        students.remove(index);
    }

    @Override
    public int hashCode() {
        return 3 * (students.size() + 42);
    }
}
