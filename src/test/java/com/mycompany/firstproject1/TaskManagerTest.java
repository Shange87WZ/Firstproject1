/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TaskManagerTest {

    TaskManager taskManager;

    @Before 
    public void setup() {
        taskManager = new TaskManager();
    }

    @Before
    public void testDeveloperEntry() {
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrington", "Samantha Paulson", "Glenda Oberzholzer"};
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Task 3", 7);
        taskManager.createTask("Done", "Glenda Oberzholzer", "Task 4", 11);
    
        String[] actualDevelopers = taskManager.getDevelopers();
        assertArrayEquals(expectedDevelopers, actualDevelopers);
    }

    @Before
    public void testLongestDurationTask() {
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Task 3", 7);
        taskManager.createTask("Done", "Glenda Oberzholzer", "Task 4", 11);

        String expected = "Glenda Oberzholzer 11";
        String actual = taskManager.getLongestDurationTask();
        assertEquals(expected, actual);
    }

    @Before
    public void testSearchTaskByName() {
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Task 3", 7);
        taskManager.createTask("Done", "Glenda Oberzholzer", "Task 4", 11);

        String expected = "Task 1 Mike Smith To do";
        String actual = taskManager.searchTaskByName("Task 1");
        assertEquals(expected, actual);
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
    }

    @Test
    public void testDeleteTask() {
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Create reports", 7);
        taskManager.createTask("Done", "Glenda Oberzholzer", "Task 4", 11);

        taskManager.deleteTask("Create reports");
        String expected = "Create reports successfully Deleted";
        String actual = taskManager.getDeleteMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void testDisplayReport() {
        taskManager.createTask("To do", "Mike Smith", "Task 1", 5);
        taskManager.createTask("Done", "Edward Harrington", "Task 2", 3);
        taskManager.createTask("Doing", "Samantha Paulson", "Task 3", 7);
        taskManager.createTask("Done", "Glenda Oberzholzer", "Task 4", 11);

        String expected = "Task 1 Mike Smith To do 5\nTask 2 Edward Harrington Done 3\nTask 3 Samantha Paulson Doing 7\nTask 4 Glenda Oberzholzer Done 11";
        String actual = taskManager.displayReport();
        assertEquals(expected, actual);
    }

    private void assertEquals(String expected, String actual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class TaskManager.java {
    // existing code...

    public void getDevelopers(){
        String[] developers;
        
    
    }
      public String getLongestDurationTask(){
        double maxDuration = 0;
        int index = 0;
        for (int i =   

                }

    String displayReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void createTask(String done, String glenda_Oberzholzer, String task_4, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDeleteMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteTask(String create_reports) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String searchTasksByDeveloper(String samantha_Paulson) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String searchTaskByName(String task_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
