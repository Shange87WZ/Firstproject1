/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject1;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class login {
     public boolean CheckUsername(String username){
       // temp variable for checking
       boolean Found = false;
       
       //check the username
       if (username.contains("")) {
       //then assign to true
       Found = true;
       //message
       System.out.println("Username is captured");
       }else{
           
        //assign to false
        Found = false;
        //message
        System.out.println("Username is not captured!!");
       }
       return Found;
       
      }
   //check the password
   public boolean checkPassword(String password){
       //pattern regex
       Pattern check_num= Pattern .compile("[0123456789]");
       Pattern check_specials = Pattern.compile("!@#$%^&*()-_}");
       Pattern check_uppercase=Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
       
       //temp variable
       boolean Found = false;
       
       //check all here
       if(check_num.matcher(password).find() && check_specials.matcher(password).find()&& check_uppercase.matcher(password).find()){
   
         //assign true
         Found=true;
         //message
         System.out.println("password successfully captured");
         
       }else{
           //assign to false
           Found = false;
           //message
           System.out.println("password is not captured");
           
       }
       
    return Found;
          
          
      }
   private String registeredUsername;
   private String registeredPassword;

   public String registerUser(String username,String password){
      if (username.length()>5  && (!username.contains("_"))){
      return "";
      }

if (password.length()<8 && (!password.matches("[QWERTYUIOPLKJHGFDSAZXCVBNM]") && (!password.matches("[0123456789]") && (!password.matches("[!@#$%^&*()_-]"))))){
 return "";   
    
}
registeredUsername=username;
registeredPassword=password;
return"User has been registered successfully";
   }
   
   //login user 
   public boolean loginUser( String username, String password){
       return username.equals(username) && password.equals(password);
       
}
   //returning login status
   public String returnLoginStatus (String username, String password){
       if(loginUser(username,password)) {
       return"login successful";
    }else{
           return"login failed";
           
       }
   }
}
