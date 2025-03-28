package com.example.usingxmlfile.associationmapping.manytomany;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "project_id")
    @GeneratedValue
    private Long projectId;

    @Column(name = "title")
    private String title;

    @jakarta.persistence.ManyToMany(mappedBy = "projects", cascade = { CascadeType.ALL })
    private Set<Employee> employees = new HashSet<Employee>();

    public Project() {
        super();
    }

    public Project(String title) {
        this.title = title;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
