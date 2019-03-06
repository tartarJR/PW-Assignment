package com.planetway.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn
    private Employee supervisor;

    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
