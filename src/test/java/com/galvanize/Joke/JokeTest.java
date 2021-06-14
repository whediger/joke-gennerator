package com.galvanize.Joke;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class JokeTest {

    @Autowired
    JokeService jokeService;

    @Test
    @DisplayName("get newly generated joke from third party API")
    void getNewJoke() {
        JokeDTO newJoke = jokeService.generateJoke();
        assertThat(newJoke.joke).isEqualTo("new joke");
    }
}
