/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.completableFuture;

/**
 *
 * @author admin
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class BankSystem {
    
    static void sleep(int ms) {
        try { TimeUnit.MILLISECONDS.sleep(ms); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        System.out.println("Bắt đầu giao dịch...");

        CompletableFuture.supplyAsync(() -> {
            System.out.println("1. Đang xác thực khách hàng...");
            sleep(1000); // Giả lập trễ
            return true; // Trả về true nếu xác thực thành công
        })
        .thenCompose(isAuthenticated -> {
            if (!isAuthenticated) throw new RuntimeException("Xác thực thất bại!");
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("2. Đang kiểm tra số dư...");
                sleep(800);
                return 2000.0; // Số dư giả định
            });
        })
        .thenAccept(balance -> {
            System.out.println("3. Thực hiện chuyển tiền từ số dư: " + balance);
            sleep(500);
            System.out.println("Giao dịch HOÀN TẤT thành công!");
        })
        .exceptionally(ex -> {
            System.err.println("Giao dịch BỊ HUỶ: " + ex.getMessage());
            return null;
        })
        .join(); // Đợi luồng phụ kết thúc để xem kết quả trong console
    }
}