package com.example.usingxmlfile.associationmapping.onetoone.usingsharedpk;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE_sharedpk")
public class EmployeeEntityUsingSharedPK implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer employeeId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AccountEntityUsingSharedPK account;

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

    public AccountEntityUsingSharedPK getAccount() {
        return account;
    }

    public void setAccount(AccountEntityUsingSharedPK account) {
        this.account = account;
    }


    //Other fields, getters, setters are hidden for brevity
}

