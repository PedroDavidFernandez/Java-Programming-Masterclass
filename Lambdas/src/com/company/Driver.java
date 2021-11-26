package com.company;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Paula", 5);
        Student student2 = new Student("Marta", 7);
        Student student3 = new Student("Pedro", 33);
        Student student4 = new Student("Amalia", 19);
        Student student5 = new Student("Helena", 25);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student student2) {
                return student.getName().compareTo(student2.getName());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName() + " age is " + student.getAge());
        }

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String toUpperCase(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, students.get(0).getName(), students.get(0).getName());
//        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        String sillyString = doStringStuff(uc, students.get(0).getName(), students.get(0).getName());
        System.out.println("=== " + sillyString);

    }

    final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.toUpperCase(s1, s2);
    }
}

@FunctionalInterface
interface UpperConcat {
    public String toUpperCase(String s1, String s2);
}

class Student {
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