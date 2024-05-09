package edu.hw6.task2;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class TestCloneFile {
    @Test
    void testCloneFile() throws IOException {
        Path path = Path.of("src/test/java/edu/hw6/task2/test.txt");
        Path path2 = Path.of("src/test/java/edu/hw6/task2/test – копия.txt");
        Path path3 = Path.of("src/test/java/edu/hw6/task2/test – копия (2).txt");
        Path path4 = Path.of("src/test/java/edu/hw6/task2/test – копия (3).txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        assertFalse(Files.exists(path2));
        assertEquals(path2, new CloneFile().cloneFile(path));
        assertTrue(Files.exists(path2));
        assertFalse(Files.exists(path3));
        assertEquals(path3, new CloneFile().cloneFile(path));
        assertTrue(Files.exists(path3));
        assertFalse(Files.exists(path4));
        assertEquals(path4, new CloneFile().cloneFile(path2));
        assertTrue(Files.exists(path4));
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            assertEquals("test data", reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Files.exists(path2)) {
            Files.delete(path2);
        }
        if (Files.exists(path3)) {
            Files.delete(path3);
        }
        if (Files.exists(path4)) {
            Files.delete(path4);
        }
    }
}
