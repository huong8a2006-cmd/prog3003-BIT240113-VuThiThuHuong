/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

/**
 *
 * @author admin
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main_Bai2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "root";
        String password = "thuvu172006"; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID user cần xóa: ");
        int idToDelete = scanner.nextInt();

        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idToDelete);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Xóa thành công user có ID: " + idToDelete);
            } else {
                System.out.println("Không tìm thấy user để xóa.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}