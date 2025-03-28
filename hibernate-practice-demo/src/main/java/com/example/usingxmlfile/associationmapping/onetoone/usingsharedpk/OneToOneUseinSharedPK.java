package com.example.usingxmlfile.associationmapping.onetoone.usingsharedpk;

import com.example.usingxmlfile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneUseinSharedPK {
    public static void main(String str[]) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
            AccountEntityUsingSharedPK account = new AccountEntityUsingSharedPK();
            account.setAccountNo("123-345-65454");

// Add new Employee object
            EmployeeEntityUsingSharedPK emp = new EmployeeEntityUsingSharedPK();
            emp.setName("ghanshyam");
            account.setEmployee(emp);
            emp.setAccount(account);
// Save Account
            session.persist(emp);
            tx.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
