/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poefinal;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <= 5  ;
           
        
    }
    
    public boolean cheackpassword(String password){
        return password.length()>= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")&& password.matches(".*[!@#$%^&*()+():|<>?=-].*");
          
            
        
        }
    
    
    public boolean cheackCellPhoneNumber(String cellphonenumber){
        return cellphonenumber.startsWith("+27") && cellphonenumber.length() == 12 ;
        
    }
           
    }

    
    
    
    

