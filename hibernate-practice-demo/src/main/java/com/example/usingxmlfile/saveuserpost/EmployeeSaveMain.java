package com.example.usingxmlfile.saveuserpost;

import com.example.usingxmlfile.pojo.Employee;
import com.example.usingxmlfile.util.HibernateUtil;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeSaveMain {
    public static void main(String str[])
    {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
          Transaction tx= session.getTransaction();
          tx.begin();
            Employee emp = new Employee();
            emp.setEmployeeId(52);
            emp.setFirstName("rajesh");
            emp.setLastName("singh");
            session.save(emp);
            session.flush();
            tx.commit();
         //    session.refresh(emp);

            Employee em= session.load(Employee.class,802);
           System.out.println(em.toString());

          //  meregDemo(sessionFactory);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public  static void meregDemo(SessionFactory factory)
    {
      Session session=  factory.openSession();
        Transaction tx = session.beginTransaction();
        Employee emp = (Employee) session.load(Employee.class, 802);
        System.out.println("Employee object loaded. " + emp);
        tx.commit();

        //merge example - data already present in tables
        emp.setLastName("hello11");
        Transaction tx8 = session.beginTransaction();
        Employee emp4 = (Employee) session.merge(emp);
        System.out.println(emp4 == emp); // returns false
        emp.setFirstName("Test");
        emp4.setFirstName("Kumar");
        System.out.println("15. Before committing merge transaction");
        tx8.commit();
        System.out.println("16. After committing merge transaction");

        // Close resources
       // sessionFactory.close();

    }
}
