package com.example.theaterservice.controller;

import com.example.theaterservice.model.Theater;
import com.example.theaterservice.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theaters")
public class TheaterController {

    @Autowired
    private TheaterRepository theaterRepository;

    @GetMapping("/")
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    // Other CRUD endpoints
}
