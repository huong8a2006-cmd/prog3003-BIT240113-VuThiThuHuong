/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
    public class QuanLySinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU QUẢN LÝ ---");
            System.out.println("1. Thêm SV | 2. Hiển thị | 3. Tìm tên | 4. Xóa MSSV | 0. Thoát");
            System.out.print("Chọn: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    System.out.print("MSSV: "); String m = sc.nextLine();
                    System.out.print("Tên: "); String t = sc.nextLine();
                    System.out.print("GPA: "); double g = Double.parseDouble(sc.nextLine());
                    ds.add(new SinhVien(m, t, g));
                }
                case 2 -> ds.forEach(System.out::println);
                case 3 -> {
                    System.out.print("Nhập tên tìm kiếm: "); String find = sc.nextLine();
                    ds.stream().filter(s -> s.ten.contains(find)).forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Nhập MSSV cần xóa: "); String del = sc.nextLine();
                    ds.removeIf(s -> s.mssv.equals(del));
                    System.out.println("Đã cập nhật danh sách.");
                }
                case 0 -> System.exit(0);
            }
        }
    }
}



