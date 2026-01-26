/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFive;

/**
 *
 * @author admin
 */
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg) { 
        System.out.println("Email: " + msg); 
    }
}


