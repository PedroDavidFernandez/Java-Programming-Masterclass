package com.company;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Employee paula = new Employee("John Doe", 5);
        Employee marta = new Employee("Mike Smith", 7);
        Employee helena = new Employee("John Snow", 39);
        Employee pedro = new Employee("Isaiah Thomas", 44);
        Employee jordan = new Employee("Michael Jordan", 64);
        Employee kobe = new Employee("Kobe Bryan", 45);

        List<Employee> employees = new ArrayList<>();
        employees.add(paula);
        employees.add(marta);
        employees.add(helena);
        employees.add(pedro);
        employees.add(jordan);
        employees.add(kobe);

        printEmployeesByAge(employees, "*** over 30 ***", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "*** 30 or less ***", employee -> employee.getAge() <= 30);
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition){
        System.out.println(ageText);
        employees.forEach(employee -> {
            if(ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
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