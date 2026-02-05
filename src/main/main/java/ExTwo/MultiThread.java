/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

/**
 *
 * @author admin
 */
public class MultiThread {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(() -> {
                for (int j = 1; j <= 10; j++) {
                   System.out.println(Thread.currentThread().getName() + " in số: " + j);
                }
            }, "Thread-" + i);
            t.start();
        }
    }
}

