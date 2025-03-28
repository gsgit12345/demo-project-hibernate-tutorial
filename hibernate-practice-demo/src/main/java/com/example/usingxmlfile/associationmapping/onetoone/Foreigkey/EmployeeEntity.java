package com.example.usingxmlfile.associationmapping.onetoone.Foreigkey;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE_foreignkey")
public class EmployeeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer employeeId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ACCOUNT_ID")
    private AccountEntity account;
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }



    //Other fields, getters, setters are hidden for brevity
}

