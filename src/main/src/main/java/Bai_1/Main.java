/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */


package Bai_1; 

public class Main {

    // --- BÀI 1: Functional Interface ---
    @FunctionalInterface
    public static interface MathOperation {
        int compute(int a, int b);
    }

    public static void main(String[] args) {
        System.out.println("--- KẾT QUẢ BÀI 1 ---");
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> (b != 0) ? a / b : 0;

        System.out.println("Cộng: " + add.compute(10, 5));
        System.out.println("Trừ: " + subtract.compute(10, 5));
        System.out.println("Nhân: " + multiply.compute(10, 5));
        System.out.println("Chia: " + divide.compute(10, 5));

    }     
}
