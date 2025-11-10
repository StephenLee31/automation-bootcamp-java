package com.bootcamp.day2;

public class Car {
    public String brand;
    public int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public int getAge(){
        return 2025 - year;
    }
}
