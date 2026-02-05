/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

/**
 *
 * @author admin
 */
import java.util.concurrent.CompletableFuture;

public class OrderSystem {
    public static void main(String[] args) {
        CompletableFuture<Void> checkStock = CompletableFuture.runAsync(() -> {
            simulateWork("Kiểm tra sản phẩm");
        });

        CompletableFuture<Void> payment = CompletableFuture.runAsync(() -> {
            simulateWork("Thanh toán");
        });

        CompletableFuture<Void> shipping = CompletableFuture.runAsync(() -> {
            simulateWork("Vận chuyển");
        });

        // Đợi tất cả hoàn thành
        CompletableFuture.allOf(checkStock, payment, shipping)
            .thenRun(() -> System.out.println(">>> ĐƠN HÀNG ĐÃ XỬ LÝ XONG!"))
            .join();
    }

    private static void simulateWork(String taskName) {
        try {
            System.out.println(taskName + " đang thực hiện...");
            Thread.sleep((long) (Math.random() * 2000)); 
            System.out.println("Hoàn thành: " + taskName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

