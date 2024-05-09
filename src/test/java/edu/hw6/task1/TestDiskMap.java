package edu.hw6.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDiskMap {
    private static final Logger log = LogManager.getLogger(TestDiskMap.class);

    @Test
    void testDiskMap() throws IOException {
        String filename1 = "src/test/java/edu/hw6/task1/testDiskMap.txt";
        String filename2 = "src/test/java/edu/hw6/task1/testDiskMap2.txt";
        File file = new File(filename1);
        if (!file.exists()) {
            assertTrue(file.createNewFile());
        }
        DiskMap diskMap = new DiskMap(file.getAbsolutePath());
        diskMap.put("11", "123");
        assertEquals("123", diskMap.get("11"));
        diskMap.put("abb", "12");
        assertEquals("12", diskMap.get("abb"));
        assertTrue(diskMap.saveInFile());

        DiskMap diskMap2 = new DiskMap(filename2);
        assertTrue(diskMap2.loadFromFile());
        assertEquals(Map.of("1", "2", "9", "10", "abb", "89", "jj", "1"), diskMap2.getMap());
    }
}
