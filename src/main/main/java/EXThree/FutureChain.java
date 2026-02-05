/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXThree;

/**
 *
 * @author admin
 */
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class FutureChain {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> new Integer[]{1, 2, 5, 3, 100}) 
            .thenApply(arr -> Arrays.stream(arr)                          
                .filter(n -> n % 2 != 0)
                .sorted()
                .collect(Collectors.toList()))
            .thenApply(list -> "Kết quả là: " + list)                    
            .thenAccept(System.out::println)                             
            .join(); 
    }
}
