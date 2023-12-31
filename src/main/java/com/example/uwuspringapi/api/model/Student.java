package com.example.uwuspringapi.api.model;

public class Student {

    private int Id;
    private String name;
    private int age;
    private String email;

    public Student(int id, String name, int age, String email) {
        Id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
