/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFive;

/**
 *
 * @author admin
 */
public class NotificationInjection {
    private MessageService service;

    public void setService(MessageService service) { // Setter Injection
        this.service = service;
    }

    public void send(String message) {
        service.sendMessage(message);
    }

    void setService(EmailService emailService) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

