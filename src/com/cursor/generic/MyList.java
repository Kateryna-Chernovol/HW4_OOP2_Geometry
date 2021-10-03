package com.cursor.generic;

import java.util.ArrayList;

public class MyList<T extends Number> {

    public ArrayList<T> arrList = new ArrayList<>();

    public void add(T element) {
        arrList.add(element);
    }

    public <T extends Comparable<T>> T largest(ArrayList<T> arrayL) {
        int iterCount = arrayL.size();
        T maxValue = arrayL.get(0);
        for (int i = 0; i < iterCount; i++) {
            if (arrayL.get(i).compareTo(maxValue) > 0) {
                maxValue = arrayL.get(i);
            }
        }
        System.out.println("Largest value in array: " + maxValue);
        return maxValue;
    }

    public <T extends Comparable<T>> T smallest(ArrayList<T> arrayL) {
        int iterCount = arrayL.size();
        T minValue = arrayL.get(0);
        for (int i = 0; i < iterCount; i++) {
            if (arrayL.get(i).compareTo(minValue) < 0) {
                minValue = arrayL.get(i);
            }
        }
        System.out.println("Smallest value in array: " + minValue);
        return minValue;
    }


    /**
     * Write two other methods, largest and smallest,
     * which return the largest and smallest values in the ArrayList.
     */
}
