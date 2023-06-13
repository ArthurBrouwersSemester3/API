package com.example.restapi.controllers;

import com.example.restapi.DAL.GymRepository;
import com.example.restapi.classes.Gym;
import com.example.restapi.classes.MyData;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;
@RestController
@AllArgsConstructor
public class GymController {

    GymRepository gymRepository;

    @GetMapping("/gyms")
    @CrossOrigin(origins = "http://localhost:5174")
    public List<String> GetGyms() {
        List<Gym> GymList = gymRepository.findAll();
        List<String> messages = new ArrayList<>();
        System.out.println(GymList);

        for (Gym gym : GymList) {
            System.out.println("1");
            String name = gym.getLocation();
            messages.add(name);
        }
        System.out.println(messages);
        System.out.println(gymRepository);
        return messages;
    }

//
    @GetMapping("/graphdata")
    @CrossOrigin(origins = "http://localhost:5174")
    public List<MyData> get(@RequestParam String gym) {
        List<MyData> list = new ArrayList<>();
        if (gym.equalsIgnoreCase("Eindhoven")) {
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
}
///




