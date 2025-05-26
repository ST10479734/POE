/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part2;
    import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class Poe_part2 {
    static ArrayList<String> sentMessages = new ArrayList<>();
    public static void main(String[]args){
        Login objLogin = new Login();
        String firstName = JOptionPane.showInputDialog(null,"Enter firstname");
        String lastName = JOptionPane.showInputDialog(null,"Enter lastname");
        
       boolean isUserNameValid = false;
       while (!isUserNameValid){
    String UserName = JOptionPane.showInputDialog(null,"Enter username");
    
    if(objLogin.checkUserName(UserName)){
        JOptionPane.showMessageDialog(null,"Username successfully captured");
        isUserNameValid = true;
        
    }else{
     JOptionPane.showMessageDialog(null,"User name is not correctly formatted please ensure that your user name contains an underscore and is no more than 5 characters in length try again");
    }
       }
       boolean isCellPhoneNumberValid = false;
       while (!isCellPhoneNumberValid){
    String CellPhoneNumber = JOptionPane.showInputDialog(null,"Enter Cellphone number");
    
    if(objLogin.cheackCellPhoneNumber(CellPhoneNumber)){
        JOptionPane.showMessageDialog(null,"Cell phone number succesfully added");
        isCellPhoneNumberValid = true;
       
    }else{
      JOptionPane.showMessageDialog(null,"Cell phone number incorrectly formatted or does not contain international code try again"); 
    }
       }
       boolean isPasswordValid = false;
       while (!isPasswordValid){
    String Password = JOptionPane.showInputDialog( null, "Enter password");
    
    if(objLogin.cheackPassword(Password)){
        JOptionPane.showMessageDialog(null,"Welcome to quick chats"+ "_" + firstName +"_" + lastName +"_"+"it's great to see you");
    }
       
        
        String[] options = {"Send Message","Recently sent message","Quit"};
        int option = JOptionPane.showOptionDialog(null, "Choose Option","Main Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,options[0] );
        
                switch (option){
                    
                    case 0:
                       String numberofMessagesStr = JOptionPane.showInputDialog("How many messages would you like to send?");
                       int numberofMessages = Integer.parseInt(numberofMessagesStr);
                       for (int i = 0; i < numberofMessages; i++){
                           String content = JOptionPane.showInputDialog("Enter your message:");
                           String recipientPhoneNumber = JOptionPane.showInputDialog("Enter recipients cellphone number");
                           if (content != null && !content.trim().isEmpty() && objLogin.cheackCellPhoneNumber(recipientPhoneNumber)){
                               Message message = new Message(content, recipientPhoneNumber);
                               String[] messageOptions = {"Send", "Store", "Discard"};
                               int messageOption = JOptionPane.showOptionDialog(null, "Choose an action for this message", "Message options",
                                       JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, messageOptions, messageOptions[0]);
                               switch (messageOption) {
                                   case 0:
                                   
                                 
                                   JOptionPane.showMessageDialog(null, "Message sent" + message.getHash());
                                   break;
                                   case 1:
                                       JOptionPane.showMessageDialog(null, "Messae stored for later");
                                       break;
                                   case 2:
                                       JOptionPane.showMessageDialog(null, "Message discarded");
                                       break;
                               }
                               
                           }
                       }
                        break;
                    case 1:
                        if (sentMessages.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No messages sent");
                        }else{
                            StringBuilder messages = new StringBuilder("Sent Messages:\n");
                            for (String msg : sentMessages){
                                messages.append("ID")
                                        .append("\nContent:")
                                        .append("\nRecipient:")
                                        .append("\nHash")
                                        .append("\n\n");
                            }
                            JOptionPane.showMessageDialog(null, messages.toString());
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Goodbye");
                        System.exit(0);
                        break;           
                }
        }
    
    
      
    }
    
       }


    
    

    
    
    
    
 


    
       

    


    
    

