package com.example.usingxmlfile.saveuserpost;

import com.example.usingxmlfile.pojo.UserPost;
import com.example.usingxmlfile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class SaveUserPost {
    public static SessionFactory sessionFactory;
    public static void main(String str[])  {
        Transaction transaction = null;
        UserPost user=new UserPost();
        user.setUserId(1);
        user.setUsername("harish");
        user.setNumberOfPosts(2);
        user.setCreatedBy("harish");
        user.setCreatedDate(new Date("2/3/2021"));
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the book objects
            session.persist(user);

            //session.persist(book1);
            // commit transaction
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
               // transaction.rollback();
            }
            ex.printStackTrace();
        }


    }
}
