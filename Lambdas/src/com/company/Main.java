package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee paula = new Employee("John Doe", 5);
        Employee marta = new Employee("Mike Smith", 7);
        Employee helena = new Employee("John Snow", 39);
        Employee pedro = new Employee("Isaiah Thomas", 44);

        List<Employee> employees = new ArrayList<>();
        employees.add(paula);
        employees.add(marta);
        employees.add(helena);
        employees.add(pedro);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
}