package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the Lamba expression");
            System.out.println("Printing from the Lamba expression 2");
        }).start();

        Employee paula = new Employee("Paula Fdez", 5);
        Employee marta = new Employee("Marta Fdez", 7);
        Employee helena = new Employee("Helena Prieto", 39);
        Employee pedro = new Employee("Pedro Fdez", 44);

        List<Employee> employees = new ArrayList<>();
        employees.add(paula);
        employees.add(marta);
        employees.add(helena);
        employees.add(pedro);

        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " is age " + employee.getAge());
        }
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