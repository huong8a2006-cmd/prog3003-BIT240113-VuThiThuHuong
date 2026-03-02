/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.menu;

/**
 *
 * @author admin
 */
import java.util.*;

 class SinhVien {
    String mssv, ten;
    double gpa;

    public SinhVien(String mssv, String ten, double gpa) {
        this.mssv = mssv;
        this.ten = ten;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("MSSV: %s | Tên: %s | GPA: %.2f", mssv, ten, gpa);
    }
}

