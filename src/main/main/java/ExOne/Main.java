/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExOne;

/**
 *
 * @author admin
 */
public class Main {
     public static void main(String[] args) {
        new BasicThread().start();
        new Thread(new WorkerRunnable()).start();
    }
}
