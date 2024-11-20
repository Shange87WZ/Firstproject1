/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject1;
import java.util.*;
/**
 *
 * @author RC_Student_lab
 */
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
    }
}
     
    
   

