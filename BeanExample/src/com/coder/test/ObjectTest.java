package com.coder.test;

import com.coder.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectTest {

    public static void main(String[] args)  {

        Configuration cfg = null;

        SessionFactory sessionFactory = null;

        Session session = null;
        Transaction tx = null;
        // Configurations

        cfg = new Configuration();
        cfg.configure("com/coder/configs/hibernate.config.xml");

        sessionFactory = cfg.buildSessionFactory();

        session = sessionFactory.openSession();

        // create our entity here

        Product product  = new Product();
        product.setPid(1);
        product.setPname("harsh");
        product.setPrice(12);
        product.setQty(2);

        try {
            tx = session.beginTransaction();
            session.save(product);

        } catch (HibernateException e) {
            System.out.println(e.toString());
        } finally {
            session.close();
        }

    }
}
