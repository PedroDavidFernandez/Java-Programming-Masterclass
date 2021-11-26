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
                .sort(students, (student, anotherStudent) -> student.getName().compareTo(anotherStudent.getName()));

        for (Student student : students) {
            System.out.println(student.getName() + " is " + student.getAge());
        }

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//        students.get(0).getName(), students.get(1).getName());
//        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        String sillyString = doStringStuff(uc, students.get(0).getName(), students.get(1).getName());
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

interface UpperConcat{
    public String upperAndConcat(String s1, String s2);
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
