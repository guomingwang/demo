package com.example.demo.java8.lambda1;

import lombok.Data;

/**
 * @author WangGuoMing
 * @since 2020/2/23
 */
@Data
public class Employee {

    private String name;

    private int age;

    private double salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
