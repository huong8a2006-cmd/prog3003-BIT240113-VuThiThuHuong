/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExThree.hibernate;

/**
 *
 * @author admin
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main_Bai3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Product tempProduct = new Product("Laptop", 1500);

            session.beginTransaction();

            System.out.println("Đang lưu sản phẩm...");
            session.save(tempProduct);

            session.getTransaction().commit();
            System.out.println("Lưu thành công! Kiểm tra lại Database nhé.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}