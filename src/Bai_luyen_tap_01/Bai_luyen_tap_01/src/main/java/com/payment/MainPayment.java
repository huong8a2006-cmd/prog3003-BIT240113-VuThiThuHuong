/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

/**
 *
 * @author admin
 */

public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPaymentMethod("PAYPAL");
        p1.process(500.0);
        
        Payment p2 = PaymentFactory.getPaymentMethod("CASH");
        p2.process(100.0);
    }
}