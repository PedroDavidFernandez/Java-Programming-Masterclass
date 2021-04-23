package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Dont repeat yourself!");
        } else {
            languages.put("Java", "this is all about Java");
        }

        languages.put("Pyhton", "an interpreted, object.orientated, high level programming language with dynamic semantics");
        languages.put("Algol", "algorithmic language");
        languages.put("Basic", "Beginners all purpose symbolic instruction code");
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println("First language is : " + languages.get("Java"));
        System.out.println("Second language is : " + languages.get("Pyhton"));
        System.out.println("Last language is : " + languages.get("Lisp"));

        System.out.println("***********************************************");

        languages.put("Java", "this is all about Java");
        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Dont repeat yourself!");
        } else {
            languages.put("Java", "this is all about Java");
        }

        System.out.println("************** LANGUAGES LIST **************");
        /*languages.remove("Lisp");
        if(languages.remove("Algol", "foo bar baz")) {
            System.out.println("Algol removed!");
        } else {
            System.out.println("key value-pair not found!");
        }

        if(languages.remove("Basic", "Beginners all purpose symbolic instruction code")) {
            System.out.println("Basic removed!");
        } else {
            System.out.println("key value-pair not found!");
        }*/

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features!"));
        System.out.println(languages.replace("Scala", "this will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
