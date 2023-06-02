package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.ArrayList;
@RestController
public class MyRestController {

    private final GymService gymService;

    @Autowired
    public MyRestController(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/gyms")
    @CrossOrigin(origins = "http://localhost:5174")
    public List<String> getGyms() {
        return gymService.getAllGymLocations();
    }


    @GetMapping("/graphdata")
    @CrossOrigin(origins = "http://localhost:5174/")
    public List<MyData> get(@RequestParam String gym) {
        List<MyData> list = new ArrayList<>();
        if(gym.equalsIgnoreCase("Eindhoven")){
            for (int i = 0; i < 13; i++) {
                int finalI = i;
                var tempdata = new MyData() {
                    {
                        setTime(8 + finalI + ":00");
                        setDay("1");
                        setValue(30);
                    }
                };
                list.add(tempdata);
            }
        }
        return list;
    }
///

    class MyData {
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
}


