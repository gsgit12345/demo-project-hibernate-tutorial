package com.example.usingxmlfile.associationmapping.oneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "question_tbl")
public class Question {
//this is the owner entity
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String qname;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private List<Answer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}

