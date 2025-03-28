package com.example.usingxmlfile.associationmapping.onetoone.mapsid;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE_c")
public class EmployeeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    @OneToOne
    @JoinColumn(name = "ID")
    @MapsId
    private AccountEntity account;
    private Integer employeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }



    //Other fields, getters, setters are hidden for brevity
}


