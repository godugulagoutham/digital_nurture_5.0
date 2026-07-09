import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    @AfterEach
    void tearDown() {
        studentService = null;
    }

    @Test
    void shouldAddStudent() {
        studentService.addStudent("Rahul");
        assertTrue(studentService.containsStudent("Rahul"));
    }

    @Test
    void shouldCountStudentsAfterAddition() {
        studentService.addStudent("Rahul");
        studentService.addStudent("Neha");
        assertEquals(2, studentService.countStudents());
    }

    @Test
    void shouldRejectEmptyName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addStudent("   "));
        assertEquals("Name cannot be empty", exception.getMessage());
    }

    @Test
    void shouldRejectNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addStudent(null));
        assertEquals("Name cannot be empty", exception.getMessage());
    }
}
