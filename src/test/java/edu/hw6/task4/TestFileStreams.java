package edu.hw6.task4;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFileStreams {
    @Test
    public void testFileStreams() throws IOException {
        Path path = Path.of("src/test/java/edu/hw6/task4/test.txt");
        String text = "Programming is learned by writing programs. ― Brian Kernighan";
        assertTrue(new FileSteams().write(text, path));
        try (BufferedReader br = Files.newBufferedReader(path)) {
            assertEquals(text, br.readLine());
        }
    }
}
