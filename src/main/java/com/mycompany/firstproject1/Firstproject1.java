/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject1;
import java.util.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class Firstproject1 {

    public static void main(String[] args) {
      login verify = new login(); 
      
      Scanner check = new Scanner(System.in);
      String firstname = "";
       String lastname = "";
        String username = "";
         String password = "";
        
     System.out.println("enter firstname");
     firstname = check.nextLine();
     System.out.println("enter lastname");
     lastname = check.nextLine();
     //use do while
     do {
        //prompt
        System.out.println("enter username: ");
        username = check.nextLine();
         
     }while(!verify.CheckUsername(username));
     
         //user do while for password
     do{
        //prompt
        System.out.println("enter password: ");
        password = check.nextLine();
         
     }while(!verify.checkPassword(password));
     
        //display
        System.out.println("welcome,"+ firstname + lastname + ",it is good to see you.");
        //messages
        System.out.println(verify.registerUser("user", "password"));
        System.out.println(verify.returnLoginStatus("user_","password"));
        
      
  
        // Login
       
       
        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid login credentials");
            return;
        }

        // Main menu
        while (true) {
            String menu = JOptionPane.showInputDialog("1. Add tasks\n2. Show report\n3. Quit");
            switch (menu) {
                case "1":
                    addTasks();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Coming soon");
                    break;
                case "3":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
            }
        }
    }

    public static boolean addTasks(CharSequence password) {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tasks"));
        Task[] tasks = new Task[numTasks];

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter task name");
            String taskDescription = JOptionPane.showInputDialog("Enter task description");
            while (taskDescription.length() > 50) {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                taskDescription = JOptionPane.showInputDialog("Enter task description");
            }
            String developerFirstName = JOptionPane.showInputDialog("Enter developer first name");
            String developerLastName = JOptionPane.showInputDialog("Enter developer last name");
            double duration = Double.parseDouble(JOptionPane.showInputDialog("Enter task duration in hours"));

            String taskId = (taskName.substring(0, 2) + ":" + i + ":" + developerLastName.substring(developerLastName.length() - 3)).toUpperCase();

            String taskStatus = JOptionPane.showInputDialog("Select task status:\n1. To do\n2. Done\n3. Doing");
            switch (taskStatus) {
                case "1":
                    taskStatus = "To do";
                    break;
                case "2":
                    taskStatus = "Done";
                    break;
                case "3":
                    taskStatus = "Doing";
                    break;
                default:
                    taskStatus = "Invalid";
            }

     
        JOptionPane.showMessageDialog(null, "Task successfully captured\n" + tasks[i].toString());
        }

        double totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.getDuration();
        }
        JOptionPane.showMessageDialog(null, "Total hours: " + totalHours);
         
        
    // Regex to check password complexity
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (Pattern.matches(passwordPattern, password)) {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return false;
        }   
    }

    private static void addTasks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    public class TaskManager {
    static String[] developers = new String[100];
    static String[] taskNames = new String[100];
    static String[] taskIDs = new String[100];
    static double[] taskDurations = new double[100];
    static String[] taskStatuses = new String[100];
    static int taskCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Task");
            System.out.println("2. Display Done Tasks");
            System.out.println("3. Longest Duration Task");
            System.out.println("4. Search Task by Name");
            System.out.println("5. Search Tasks by Developer");
            System.out.println("6. Delete Task");
            System.out.println("7. Display Report");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    displayDoneTasks();
                    break;
                case 3:
                    longestDurationTask();
                    break;
                case 4:
                    searchTaskByName(scanner);
                    break;
                case 5:
                    searchTasksByDeveloper(scanner);
                    break;
                case 6:
                    deleteTask(scanner);
                    break;
                case 7:
                    displayReport();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    static void createTask(Scanner scanner) {
        System.out.print("Enter task status (To do/Done/Doing): ");
        String taskStatus = scanner.nextLine();
        System.out.print("Enter developer's name: ");
        String developer = scanner.nextLine();
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        System.out.print("Enter task duration in hours: ");
        double duration = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
        String taskId = taskName.substring(0, 2) + ":" + taskCount + ":" + developer.split(" ")[1];

        developers[taskCount] = developer;
        taskNames[taskCount] = taskName;
        taskIDs[taskCount] = taskId;
        taskDurations[taskCount] = duration;
        taskStatuses[taskCount] = taskStatus;

        taskCount++;

        System.out.println("Task created successfully");
    }

    static void displayDoneTasks() {
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equals("Done")) {
                System.out.println("Developer: " + developers[i]);
                System.out.println("Task Name: " + taskNames[i]);
                System.out.println("Duration: " + taskDurations[i] + " hours");
                System.out.println();
            }
        }
    }

    static void longestDurationTask() {
        double maxDuration = 0;
        int index = 0;
        for (int i = 0; i < taskCount; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                index = i;
            }
        }
        System.out.println("Developer: " + developers[index]);
        System.out.println("Duration: " + taskDurations[index] + " hours");
    }

    static void searchTaskByName(Scanner scanner) {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equals(taskName)) {
                System.out.println("Task Name: " + taskNames[i]);
                System.out.println("Developer: " + developers[i]);
                System.out.println("Task Status: " + taskStatuses[i]);
                return;
            }
        }
        System.out.println("Task not found");
    }

    static void searchTasksByDeveloper(Scanner scanner) {
        System.out.print("Enter developer's name: ");
        String developerName = scanner.nextLine();
        for (int i = 0; i < taskCount; i++) {
            if (developers[i].equals(developerName)) {
                System.out.println("Task Name: " + taskNames[i]);
                System.out.println("Task Status: " + taskStatuses[i]);
                System.out.println();
            }
        }
    }

    static void deleteTask(Scanner scanner) {
        System.out.print("Enter task name: ");
        String taskName;

    }

        private static void displayReport() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   }
}