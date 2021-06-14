package com.galvanize.Joke;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class JokeTest {

    @InjectMocks
    JokeService subject;

    @Test
    @DisplayName("get newly generated joke from third party API")
    void getNewJoke() {
        JokeDTO actual = subject.generateJoke();
        assertThat(actual.getJoke()).isEqualTo("new joke");
    }
}
