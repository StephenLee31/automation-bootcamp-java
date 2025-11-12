package com.bootcamp.day4;

public class AppConfigDemo {
    public static void main(String[] args) {
        System.out.println(ConfigReader.get("baseUrl"));
        System.out.println(ConfigReader.get("browser"));
    }
}
