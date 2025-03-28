package com.example.usingxmlfile.pojo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="demo_employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = -1798070786993154676L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer           employeeId;
    @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
    private String            firstName;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
    private String            lastName;
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
