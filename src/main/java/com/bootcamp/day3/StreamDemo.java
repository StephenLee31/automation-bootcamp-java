package com.bootcamp.day3;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Alice", "admin", 30));
        users.add(new User("Bob", "editor", 25));
        users.add(new User("Tom", "admin", 40));

        // filter admin
        List<User> admins = users.stream()
                .filter(u -> u.role.equals("admin"))
                .toList();
        System.out.println("Admins: " + admins.size());

        // extract name
        List<String> names = users.stream()
                .map(u -> u.name)
                .toList();
        System.out.println("Names: " + names);

        // sort by age
        List<User> sorted = users.stream()
                .sorted((u1,u2) -> u1.age - u2.age)
                .toList();

        System.out.println("Youngest: " + sorted.get(0).name);
    }
}
