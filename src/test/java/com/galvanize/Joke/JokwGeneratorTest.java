package com.galvanize.Joke;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class JokwGeneratorTest {

    @InjectMocks
    JokeGenerator subject;

    @Mock
    RestTemplate restTemplate;

    @Test
    @DisplayName("make call to get random generated joke from external API")
    void generateJoke() {
        GeneratedJokeDTO mockGeneratedJokeDTO = new GeneratedJokeDTO("new joke");
        when(restTemplate).thenReturn(mockGeneratedJokeDTO);

        GeneratedJokeDTO actual = subject.getNewJoke();
        verify(restTemplate).getForObject("https://icanhazdadjoke.com/", GeneratedJokeDTO);
        assertThat(actual.getJoke()).isEqualTo("new joke");
    }
}
