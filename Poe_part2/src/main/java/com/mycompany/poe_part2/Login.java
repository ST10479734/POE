/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part2;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    public boolean checkUserName(String username) {
        //username must contain an underscore and be no longer than 5 characters
        return username.contains("_") && username.length() <= 5;
    }

    
    public boolean cheackPassword(String password) {
        // Check if password is valid (at least 8 characters, contains an uppercase letter,number, and special character)  
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*()+():|<>?=-].*");
    }

    
    public boolean cheackCellPhoneNumber(String cellphonenumber) {
       // chrecks if phone number starts with +27 and exactly 12 digits long
        return cellphonenumber.startsWith("+27") && cellphonenumber.length() == 12;
    }
}

    

   
