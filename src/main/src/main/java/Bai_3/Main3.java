/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_3;

/**
 *
 * @author admin
 */
import java.util.function.Predicate;
public class Main3 {
    public static void main(String[]args){
     // --- BÀI 3: Kiểm tra số chẵn bằng Predicate ---
        System.out.println("\n--- KẾT QUẢ BÀI 3 ---");
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        int testNum = 8;
        System.out.println("Số " + testNum + " là số chẵn? " + isEven.test(testNum));
        System.out.println("Số 15 là số chẵn? " + isEven.test(15));
    }
}
