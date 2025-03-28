package com.example.usingxmlfile.associationmapping.manytomany;

import com.example.usingxmlfile.util.HibernateUtil;
import org.hibernate.Session;

public class ManyToMany {
    public static void main(String str[])
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Create an employee
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("Fadatare");

        // Create project1
        Project project = new Project();
        project.setTitle("Employee Management System");

        // Create project2
        Project project1 = new Project();
        project1.setTitle("Content Management System");

        // employee can work on two projects, Add project references in the employee
        employee.getProjects().add(project);
        employee.getProjects().add(project1);

        // Add employee reference in the projects
        project.getEmployees().add(employee);
        project1.getEmployees().add(employee);

        session.persist(employee);

        session.getTransaction().commit();

    }
}
