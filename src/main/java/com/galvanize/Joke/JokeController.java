package com.galvanize.Joke;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @GetMapping("/joke/new")
    public String getNewJoke() {
        return "{\"joke\": \"new joke\"}";
    }
}
