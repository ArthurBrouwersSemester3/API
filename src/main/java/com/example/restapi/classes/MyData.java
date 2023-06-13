package com.example.restapi.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyData {
    @JsonProperty("time")
    private String time;
    @JsonProperty("day")
    private String day;
    @JsonProperty("value")
    private int value;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
