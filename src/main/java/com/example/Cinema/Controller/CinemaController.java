package com.example.Cinema.Controller;


import com.example.Cinema.Entities.Cinema;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CinemaController {

    private final List<String> cinemas = new ArrayList<String>();

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/GETString")
    public String GETString() {
        return "Hello W.. sorry, Hello Cinema!)))";
    }


    @GetMapping("/cinema")
    public String getCinema() {
        return cinemas.toString();
    }


    @PostMapping("/cinema")
    public String postCinema(@RequestParam String cinemaName,
                             @RequestParam String genre,
                             @RequestParam String date) throws JsonProcessingException {
        String jsonText= null;


        if(cinemaName.equals(new String(""))
                || genre.equals(new String(""))
                || date.equals(new String(""))) {
            jsonText = objectMapper.writeValueAsString("Sorry but need to validete all values");
            return jsonText;
        }

        int size = cinemas.size();

        try {
            Cinema cinema = new Cinema(size, cinemaName, genre, date);
            jsonText = objectMapper.writeValueAsString(cinema);
            cinemas.add(jsonText);
        } catch (JsonProcessingException e) {
            System.out.println("Exception in postCinema " + e.getMessage());
        }
        return cinemas.toString();
    }



}
