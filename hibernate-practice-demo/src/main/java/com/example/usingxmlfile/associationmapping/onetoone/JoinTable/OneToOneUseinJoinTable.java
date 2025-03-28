package com.example.usingxmlfile.associationmapping.onetoone.JoinTable;

import com.example.usingxmlfile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneUseinJoinTable {
    public static void main(String str[]) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
            AccountEntityUsingJoinTable account = new AccountEntityUsingJoinTable();
            account.setAccountNo("123-345-65454");

// Add new Employee object
            EmployeeEntityUsingJoinTable emp = new EmployeeEntityUsingJoinTable();
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
