package com.galvanize.Joke;

import org.springframework.stereotype.Service;

@Service
public class JokeService {

    public JokeDTO generateJoke() {
        return new JokeDTO("new joke");
    }
}
