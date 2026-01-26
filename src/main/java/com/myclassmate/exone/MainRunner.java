/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclassmate.exone;

/**
 *
 * @author admin
 */
import ExOne.DatabaseConnection;
import ExTwo.*; 
import ExThree.HomeTheaterfacade;
import ExFour.*;
import ExFive.*;

public class MainRunner {
    public static void main(String[] args) {
        
        System.out.println("--- BÀI 1: SINGLETON ---");
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.query("SELECT * FROM Users");

        System.out.println("\n--- BÀI 2: FACTORY ---");
        NotificationFactory factory = new NotificationFactory();
        Notification note = factory.createNotification("SMS");
        note.notifyUser();

        System.out.println("\n--- BÀI 3: FACADE ---");
        HomeTheaterfacade homeTheater = new HomeTheaterfacade();
        homeTheater.watchMovie();

        System.out.println("\n--- BÀI 4: STRATEGY ---");
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(500);

        System.out.println("\n--- BÀI 5: DEPENDENCY INJECTION ---");
        ExFive.NotificationInjection diNote = new ExFive.NotificationInjection(); 
        diNote.setService(new EmailService());
        diNote.send("Hello DI!");
    }
}

