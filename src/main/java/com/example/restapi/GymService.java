package com.example.restapi;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class GymService {
    private final GymRepository gymRepository;

    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    public List<String> getAllGymLocations() {
        List<Gym> gyms = gymRepository.findAll();
        return gyms.stream().map(Gym::getLocation).collect(Collectors.toList());
    }
}


