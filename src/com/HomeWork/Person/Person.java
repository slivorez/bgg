package com.HomeWork.Person;

public abstract class Person {

    private String name;
    private int age;
    private String gender;

    public abstract String salary();

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
    }
}

