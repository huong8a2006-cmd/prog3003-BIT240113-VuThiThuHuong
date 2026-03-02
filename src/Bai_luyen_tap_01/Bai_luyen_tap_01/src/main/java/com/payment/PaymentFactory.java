/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

/**
 *
 * @author admin
 */

class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        return switch (type.toUpperCase()) {
            case "CREDIT" -> new CreditCardPayment();
            case "PAYPAL" -> new PayPalPayment();
            case "CASH" -> new CashPayment();
            default -> throw new IllegalArgumentException("Phương thức không hợp lệ");
        };
    }
}