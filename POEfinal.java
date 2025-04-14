/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poefinal;

import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class POEfinal {

    public static void main(String[] args) {
        
        //Creating an instance to create class
        Login objLogin = new Login();
        
         //Create a scanner class
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Please enter your first name");
        
         //user enter the first name
        String firstName = input.nextLine();
        
         //Prompting user to enter the last name
        System.out.println("Please enter your last name");
        
         //user enter the username
        String lastName = input.nextLine();
        
        //Prompting user to enter username
        System.out.println("Please enter your user name");
        
         //user enter the username
        String username =input.nextLine();
        
        //using if statements to check the username
        if(objLogin.checkUserName(username) == true){
        
             //Displaying the results 
            System.out.println("Username successfully captured");
            }else{
             //Displaying the results 
            System.out.println("User name is not correctly formatted please ensure that your user name contains an underscore and is no more than 5 characters in length");
        }
            
        
    
    
    //Prompting user to enter the password
    System.out.println("Enter phone number");
    
    //user enter the password
    String cellphonenumber = input.nextLine();
    
    //using if statements to check the username
    if(objLogin.cheackCellPhoneNumber(cellphonenumber)== true){
        
        //Displaying the results
        System.out.println("Cell phone number succesfully added");
        
    }else{
        
        //Displaying the results 
        System.out.println("Cell phone number incorrectly formatted or does not contain international code");
    }
     //Prompting user to enter the password
    System.out.println("Enter password");
    
    //user enter the password
    String password = input.nextLine();
    
    //using if statements to check the username
    if(objLogin.cheackpassword(password)){                
        //Displaying the results 
        System.out.println("Welcome " + firstName + lastName  + " it is great to see you");   
    }else{     
    //Displaying the results 
    System.out.println("Username or password incorrect try again");     
    }
    
    
    
    
    }
    }

