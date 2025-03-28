package com.example.usingxmlfile.associationmapping.onetoone.JoinTable;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE_jointable")
public class EmployeeEntityUsingJoinTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer employeeId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="EMPACC_FOREIGN",joinColumns=@JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "ACCOUNT_ID"))
    private AccountEntityUsingJoinTable account;
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

    public AccountEntityUsingJoinTable getAccount() {
        return account;
    }

    public void setAccount(AccountEntityUsingJoinTable account) {
        this.account = account;
    }



    //Other fields, getters, setters are hidden for brevity
}

