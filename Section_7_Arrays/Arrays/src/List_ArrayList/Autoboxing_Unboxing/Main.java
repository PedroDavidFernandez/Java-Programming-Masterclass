package Autoboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        // arrays recap
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        // Arrays List recap
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); -> not correct, int is not a class, but a primitive
        // We can create our own int class like so:
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Java provides a better way of doing this (autoboxing)
        // With autoboxing we can wrap-up the primitive type
        Integer integer = new Integer(54);
        Double doubleValue = new Double(54.5);

        // Autoboxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        // Unboxing
        for (int i=0; i<10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // short way of doing this
        Integer myIntValue = 56; // (boxing) same as: Integer.valueOf(56);
        //System.out.println(myIntValue.getClass());
        int myInt = myIntValue; // (unboxing) same as: myIntValue.intValue();
        //System.out.println(myInt);

//        Double myDoubleValue = 56.5; // same as: Double.valueOf(56.5);
        System.out.println(" ************************************** ");

        // autoboxing
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl<10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
            // it can be shortened like so
            myDoubleValues.add(dbl);
        }

        // unboxing
        for (int i=0; i<myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
            // it can be shortened like so
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
