package edu.hw6.task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

public class FileSteams {
    private static final Logger LOGGER = LogManager.getLogger(FileSteams.class);

    public boolean write(String text, Path path) {
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                LOGGER.error("Create file error", e);
                return false;
            }
        }
        try (OutputStream outputStream = Files.newOutputStream(path);
             CheckedOutputStream checkedOutputStream = new CheckedOutputStream(outputStream, new CRC32());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(checkedOutputStream);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                     bufferedOutputStream,
                     StandardCharsets.UTF_8);
             PrintWriter printWriter = new PrintWriter(outputStreamWriter)) {
            printWriter.print(text);
        } catch (IOException e) {
            LOGGER.error("Write file error", e);
            return false;
        }
        return true;
    }
}
