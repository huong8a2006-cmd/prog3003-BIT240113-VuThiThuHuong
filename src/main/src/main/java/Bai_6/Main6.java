/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_6;

/**
 *
 * @author admin
 */
import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        int result = numbers.stream()
                            .filter(n -> n % 2 == 0)
                            .map(n -> n * n)
                            .mapToInt(Integer::intValue)
                            .sum();
                            
        System.out.println("Tổng bình phương các số chẵn: " + result);
    }
}