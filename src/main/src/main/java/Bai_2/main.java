/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[]args){
      // --- BÀI 2: Sắp xếp theo độ dài tên ---
        System.out.println("\n--- KẾT QUẢ BÀI 2 ---");
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        
        Collections.sort(cities, (s1, s2) -> s1.length() - s2.length());
        
        System.out.println("Danh sách thành phố sau khi sắp xếp:");
        cities.forEach(System.out::println);

    }
}
