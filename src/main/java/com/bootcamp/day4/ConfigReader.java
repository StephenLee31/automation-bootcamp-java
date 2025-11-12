package com.bootcamp.day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties props = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("config.properties not found!");
        }
    }

    public static String get(String key) {
        String value = props.getProperty(key);
        if (value == null) throw new InvalidConfigException("Key not found: " + key);
        return value;
    }
}
