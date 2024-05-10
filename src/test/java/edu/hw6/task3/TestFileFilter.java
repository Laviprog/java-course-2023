package edu.hw6.task3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static edu.hw6.task3.FileFilters.*;

public class TestFileFilter {
    @Test
    void testFileFilter() throws IOException {
        DirectoryStream.Filter<Path> filter = REGULAR
                .and(READABLE)
                .and(largerThan(75L))
                .and(globMatches("*.txt"))
                .and(regexContains("file"));
        Path dir = Path.of("src/test/java/edu/hw6/task3");
        try (DirectoryStream<Path> entries = Files.newDirectoryStream(dir, filter)) {
            entries.forEach(System.out::println);
        }
    }
}
