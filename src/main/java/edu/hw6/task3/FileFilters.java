package edu.hw6.task3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.regex.Pattern;

public class FileFilters {
    public static final AbstractFilter REGULAR = Files::isRegularFile;
    public static final AbstractFilter READABLE = Files::isReadable;
    public static final AbstractFilter WRITEABLE = Files::isWritable;

    private FileFilters() {
    }

    public static AbstractFilter regexContains(String regex) {
        return entry -> Pattern.compile(regex).matcher(entry.getFileName().toString()).find();
    }

    public static AbstractFilter globMatches(String regex) {
        return entry -> Pattern.compile("^." + regex + "$").matcher(entry.getFileName().toString()).find();
    }

    public static AbstractFilter largerThan(Long size) {
        return entry -> Files.size(entry) > size;
    }

    public static AbstractFilter magicNumber(byte... bytes) {
        return entry -> {
            byte[] buffer = new byte[bytes.length];
            try (InputStream inputStream = new FileInputStream(entry.toString())) {
                if (inputStream.read(buffer) != buffer.length) {
                    return false;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return Arrays.equals(bytes, buffer);
        };
    }
}
