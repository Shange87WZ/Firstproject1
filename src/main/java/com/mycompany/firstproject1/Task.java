/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {

    private String taskStatus;
    private String developer;
    private int taskNumber;
    private String taskName;
    private String taskDescription;
    private String taskId;
    private double duration;


    Task(String taskStatus, String string, int i, String taskName, String taskDescription, String taskId, double duration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task Status: " + taskStatus + "\nDeveloper: " + developer + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskId + "\nDuration: " + duration + " hours";
        
         // Method to check task description length

    }
    public boolean checkTaskDescription(String taskDescription){
        return taskDescription.length() <= 50;
    }

    // Method to create TaskID
    public static String createTaskID(String taskName, int taskNumber, String developerLastName) {
        return (taskName.substring(0, 2) + ":" + taskNumber + ":" + developerLastName.substring(developerLastName.length() - 3)).toUpperCase();
    }

    // Method to print task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\nDeveloper: " + developer + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskId + "\nDuration: " + duration + " hours";
    }

    // Method to return total hours (static method)
    public static int returnTotalHours(Task[] tasks) {
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.duration;
        }
        return totalHours;
    }
}

    





    

