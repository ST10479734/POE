/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part2;

import java.util.*;


/**
 *
 * @author RC_Student_lab
 */
class Message {
    private static int messageCount = 0;
    private String id;
    private String content;
    private String recipientPhoneNumber;
    private String hash;
    
    public Message(String content, String recipientPhoneNumber){
        this.id = generateMessageId();
        this.content = content;
        this.recipientPhoneNumber = recipientPhoneNumber;
        this.hash = generateMessageHash();
        messageCount++;
    }
    private String generateMessageId(){
        return UUID.randomUUID().toString().substring(0, 10).toUpperCase();
    }
    private String generateMessageHash(){
        String[] words = content.split("");
        String firstWord = words.length > 0 ? words[0]:"";
        String lastWord = words.length > 1 ? words[words.length - 1]: "";
        return id.substring(0, 2)+":"+ messageCount + ":" + firstWord + ":" + lastWord;
    }
    public static int getMessageCount(){
        return messageCount;
    }
    public String getId(){
        return id;
    }
    public String getContent(){
        return content;
    }
    public String getRecipientPhoneNumber(){
        return recipientPhoneNumber;
    }
    public String getHash(){
        return hash;
    }
    public static List<Message>gettAllMessages(List<Message> sentMessages){
        return new ArrayList<>(sentMessages);
    }
    
}

    
