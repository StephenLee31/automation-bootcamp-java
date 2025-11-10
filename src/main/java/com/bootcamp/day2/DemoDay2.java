package com.bootcamp.day2;

public class DemoDay2 {
    public static void main(String[] args) {
        User u = new User("Alice", 25);
        u.sayHello();

        Student s = new Student("Bob", 8.8);
        s.getInfo();

        Car c = new Car("Toyata", 2015);
        System.out.println("Car age: " + c.getAge());
    }
}
