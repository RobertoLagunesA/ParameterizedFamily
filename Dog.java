package com.company;

public class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }

    public void print() {
        System.out.println(this.toString());
    }
}

