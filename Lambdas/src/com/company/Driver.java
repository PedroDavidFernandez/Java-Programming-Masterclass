package com.company;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("pedro", 44);
        Student student2 = new Student("amalia", 21);
        Student student3 = new Student("marta", 47);
        Student student4 = new Student("paula", 5);
        Student student5 = new Student("helena", 19);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections
                .sort(students, (Student student, Student anotherStudent) -> student.getName().compareTo(anotherStudent.getName()));

        for (Student student : students) {
            System.out.println(student.getName() + " is " + student.getAge());
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
