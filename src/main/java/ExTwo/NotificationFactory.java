/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

/**
 *
 * @author admin
 */
public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) return null;
        switch (channel.toUpperCase()) {
            case "SMS" -> {
                return new SMS();
            }
            case "EMAIL" -> {
                return new Email();
            }
            default -> throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}
  

