/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

/**
 *
 * @author admin
 */

import ExThree.hibernate.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main_Bai4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            String hql = "FROM Product p WHERE p.price > 1000";

            List<Product> products = session.createQuery(hql, Product.class).getResultList();

            System.out.println("\n--- DANH SÁCH SẢN PHẨM GIÁ > 1000 ---");
            if (products.isEmpty()) {
                System.out.println("Không có sản phẩm nào thỏa mãn điều kiện.");
            } else {
                for (Product p : products) {
                    System.out.println("ID: " + p.getId() + " | Tên: " + p.getName() + " | Giá: " + p.getPrice());
                }
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}