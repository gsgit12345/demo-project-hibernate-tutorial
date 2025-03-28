package com.example.usingxmlfile.associationmapping.onetoone.mapsid;

import com.example.usingxmlfile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Connection;

public class OneToOneUseinMapsId {
    public static void main(String str[]) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
          //  session.doWork(connection -> connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED));
            //managening
            AccountEntity account = new AccountEntity();
            account.setAccountNo("123-345-65454");
//NOT WORKING

// Add new Employee object
            EmployeeEntity emp = new EmployeeEntity();
            emp.setName("ghanshyam");

            emp.setAccount(account);
// Save Account
            session.persist(emp);
            tx.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
