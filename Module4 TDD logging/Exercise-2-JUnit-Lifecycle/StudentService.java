import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        students.add(name);
    }

    public int countStudents() {
        return students.size();
    }

    public boolean containsStudent(String name) {
        return students.contains(name);
    }
}
