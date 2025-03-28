package com.example.usingxmlfile.associationmapping.onetoone.Foreigkey;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_foreignkey")
public class AccountEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer accountId;
    private String accountNo;
    @OneToOne(mappedBy = "account")
    private EmployeeEntity employee;
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }



//Other fields, getters, setters are hidden for brevity
}