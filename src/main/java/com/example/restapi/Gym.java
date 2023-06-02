package com.example.restapi;

import javax.persistence.*;

@Entity
    @Table(name = "GymInformation")
    public class Gym {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String location;

        public Gym() {
            // Default constructor
        }

        public Gym(String location) {
            this.location = location;
        }

        // Getters and Setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }

