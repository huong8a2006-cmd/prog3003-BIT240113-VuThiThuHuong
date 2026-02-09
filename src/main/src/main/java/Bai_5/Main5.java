/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_5;

/**
 *
 * @author admin
 */
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Main5 {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random() * 100;
        Consumer<Double> printer = d -> System.out.printf("Số may mắn: %.2f%n", d);
        
        printer.accept(randomSupplier.get());
    }
}