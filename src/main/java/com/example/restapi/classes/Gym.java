package com.example.restapi.classes;


import jakarta.persistence.*;

@Entity
@Table(name = "GymInformation")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String location;

    public Gym() {
        // Default constructor
    }

    public Gym(String location) {
        this.location = location;
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
