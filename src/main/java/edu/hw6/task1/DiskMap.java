package edu.hw6.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.*;

public class DiskMap implements Map<String, String> {
    private static final Logger LOGGER = LogManager.getLogger(DiskMap.class);
    private final HashMap<String, String> map = new HashMap<>();
    private String filename;

    public DiskMap(String filename) {
        this.filename = filename;
    }

    public DiskMap(String filename, Map<String, String> map) {
        this.filename = filename;
        this.map.putAll(map);
    }

    public boolean saveInFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (FileNotFoundException e) {
            LOGGER.error("Save in file: {} not found", filename);
            return false;
        } catch (IOException e) {
            LOGGER.error("Save in file: IOException: {}", e.getMessage());
            return false;
        }
        return true;
    }

    public boolean loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.ready()) {
                String[] line = br.readLine().split(":");
                map.put(line[0], line[1]);
            }
        } catch (FileNotFoundException e) {
            LOGGER.error("Load from file: {} not found", filename);
            return false;
        } catch (IOException e) {
            LOGGER.error("Load from file: IOException: {}", e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public String get(Object key) {
        return map.get(key);
    }

    @Nullable
    @Override
    public String put(String key, String value) {
        return map.put(key, value);
    }

    @Override
    public String remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(@NotNull Map<? extends String, ? extends String> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @NotNull
    @Override
    public Set<String> keySet() {
        return map.keySet();
    }

    @NotNull
    @Override
    public Collection<String> values() {
        return map.values();
    }

    @NotNull
    @Override
    public Set<Entry<String, String>> entrySet() {
        return map.entrySet();
    }

    public String getFilename() {
        return filename;
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
