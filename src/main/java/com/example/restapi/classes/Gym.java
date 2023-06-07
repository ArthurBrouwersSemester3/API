package com.example.restapi.classes;


import jakarta.persistence.*;

@Entity
@Table(name = "Gyminformation")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    @Column(name = "Location")
    private String Location;

    public Gym() {
        // Default constructor
    }

    public Gym(String location) {
        this.Location = location;
    }

    // Getters and Setters

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }
}
