package com.company;

public class Labrador extends Dog{
    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//
//        System.out.println("From Labrador class - obj.getClass() is: " + obj.getClass());
//        if(obj instanceof Labrador) {
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//
//        return false;
//    }
}
