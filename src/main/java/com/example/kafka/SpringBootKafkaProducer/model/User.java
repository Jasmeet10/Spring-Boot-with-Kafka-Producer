package com.example.kafka.SpringBootKafkaProducer.model;

public class User {
    String Name;
    String Technology;
    Long Salary;

    public User(String name, String technology, Long salary) {
        Name = name;
        Technology = technology;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTechnology() {
        return Technology;
    }

    public void setTechnology(String technology) {
        Technology = technology;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }
}
