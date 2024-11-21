import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskManagerTest {

    TaskManager taskManager;

    @Before
    public void setup() {
        taskManager = new TaskManager();
    }

    @Test
    public void testDeveloperEntry() {
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrington", "Samantha Paulson", "Glenda Oberzholzer"};
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Task 3", 7);
        taskManager.createTask("Done", "Glenda Oberzholzer", "Task 4", 11);

        String[] actualDevelopers = taskManager.getDevelopers();
        assertArrayEquals(expectedDevelopers, actualDevelopers);
    }

   @Test
    public void testSearchTasksByDeveloper() {
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Task 3", 7);
        taskManager.createTask("Done", "Samantha Paulson", "Task 4", 11);

        String expected = "Task 3 To do\nTask 4 Done";
        String actual = taskManager.searchTasksByDeveloper("Samantha Paulson");
        assertEquals(expected, actual);
     
}public class TaskManager {
    // existing code...

    public String[] getDevelopers() {
        String[] developers = null;
        return developers;
    }

    public String getLongestDurationTask() {
        double maxDuration = 0;
        int index = 0;
        for (int i =


        private String searchTasksByDeveloper(String samantha_Paulson) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private void createTask(String to_do, String mike_Smith, String task_1, int i) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}

        
