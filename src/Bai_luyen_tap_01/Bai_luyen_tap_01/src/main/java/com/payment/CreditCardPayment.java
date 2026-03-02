/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payment;

/**
 *
 * @author admin
 */
interface Payment {
    void process(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void process(double amount) { System.out.println("Thanh toán " + amount + " qua Credit Card."); }
}






