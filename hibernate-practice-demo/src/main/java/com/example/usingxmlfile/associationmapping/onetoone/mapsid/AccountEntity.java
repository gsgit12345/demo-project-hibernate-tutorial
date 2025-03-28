package com.example.usingxmlfile.associationmapping.onetoone.mapsid;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_c")
public class AccountEntity implements Serializable {
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    private String accountNo;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    @OneToOne
    @JoinColumn(name = "ID")
    private Integer accountId;

    //Other fields, getters, setters are hidden for brevity
}

