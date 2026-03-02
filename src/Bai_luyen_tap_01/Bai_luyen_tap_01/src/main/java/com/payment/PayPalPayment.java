/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

/**
 *
 * @author admin
 */
class PayPalPayment implements Payment {

    PayPalPayment() {
    }
    @Override
    public void process(double amount) { System.out.println("Thanh toán " + amount + " qua PayPal."); }
}

