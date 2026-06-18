import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    // Alt enter over Test to add JUnit
    @Test
    public void testAddStudent() {
        ArrayList<Student> students = new ArrayList<>();
        StudentManager manager = new StudentManager(students);
        manager.addStudent("emma", 12, "CS");
        assertEquals(manager.getCount(),1);
    }

    @Test
    public void testRemoveStudent() {
        ArrayList<Student> students = new ArrayList<>();
        StudentManager manager = new StudentManager(students);
        manager.addStudent("emma", 12, "CS");
        assertEquals(manager.getCount(),1);
        manager.removeStudent("emma");
        assertEquals(manager.getCount(),0);
    }

    @Test
    public void testFindStudent() {
        ArrayList<Student> students = new ArrayList<>();
        StudentManager manager = new StudentManager(students);
        manager.addStudent("emma", 12, "CS");
        assertEquals(manager.findStudent("bob"), null);
        assertEquals(manager.findStudent("emma").getName(), "emma");
    }
}