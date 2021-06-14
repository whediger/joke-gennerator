package com.galvanize.Joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/joke/new")
    public JokeDTO getNewJoke() {
        return jokeService.generateJoke();
    }
}
