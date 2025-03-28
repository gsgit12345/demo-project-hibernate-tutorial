package com.example.usingxmlfile.associationmapping.onetoone.JoinTable;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_jointable")
public class AccountEntityUsingJoinTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer accountId;
    private String accountNo;
    @OneToOne(mappedBy = "account")
    private EmployeeEntityUsingJoinTable employee;
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

    public EmployeeEntityUsingJoinTable getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntityUsingJoinTable employee) {
        this.employee = employee;
    }



//Other fields, getters, setters are hidden for brevity
}