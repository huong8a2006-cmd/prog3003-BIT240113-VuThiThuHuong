/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_4;

/**
 *
 * @author admin
 */
import java.util.*;
import java.util.function.Function;

public class Main4 {
    public static void main(String[] args) {
        // ---BÀI 4:Chuyển đổi tiền tệ
        System.out.println("\n--- KẾT QUẢ BÀI 4 ---");
        List<String> currencies = Arrays.asList("$10", "$20", "$50");
       Function<String, Integer> converter = s -> Integer.valueOf(s.replace("$", ""));
        
        List<Integer> values = new ArrayList<>();
        for (String s : currencies) {
            values.add(converter.apply(s));
        }
        
        System.out.println("Kết quả chuyển đổi: " + values);
    }
}
