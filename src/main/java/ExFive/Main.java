/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFive;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        NotificationInjection note = new NotificationInjection();

        note.setService(new EmailService());
        note.send("Chào bạn qua Email!");

        note.setService((MessageService) new SMSService());
        note.send("Chào bạn qua SMS!");
    }
}

