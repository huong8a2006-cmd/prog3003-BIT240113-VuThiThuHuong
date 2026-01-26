/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

/**
 *
 * @author admin
 */
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) { 
        System.out.println("Paid " + amount + " via Credit Card."); 
    }
}

