package com.company.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(-5);
        System.out.println(person.getAge());
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
