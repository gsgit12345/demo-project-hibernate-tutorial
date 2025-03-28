package com.example.usingxmlfile.associationmapping.onetoone.usingsharedpk;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_sharedpk")
public class AccountEntityUsingSharedPK implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign", parameters =
    @org.hibernate.annotations.Parameter(name = "property", value = "employee"))

    private Integer accountId;
    private String accountNo;
    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private EmployeeEntityUsingSharedPK employee;
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

    public EmployeeEntityUsingSharedPK getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntityUsingSharedPK employee) {
        this.employee = employee;
    }



//Other fields, getters, setters are hidden for brevity
}