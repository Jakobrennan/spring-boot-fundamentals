package com.exercises.fundamental.springfundamentals.entity;
import javax.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="application_id")
    private Integer id;

    @Column(name="app_name", nullable = false)
    private String name;

    @Column(length=2000)
    private String description;
    private String owner;
}
