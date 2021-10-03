package com.cursor.generic;

import java.util.ArrayList;

public class MyListSecond<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T element) {
        list.add(element);
    }

//    public <T extends Comparable<T>> T largest(ArrayList<T> liast) {
//        int iterCount = list.size();
//        T maxValue = list.get(0);
//        for (int i = 0; i < iterCount; i++) {
//            if (list.get(i).compareTo(maxValue) > 0) {
//                maxValue = list.get(i);
//            }
//        }
//        System.out.println("Largest value in array: " + maxValue);
//        return maxValue;
//    }

//    public <T extends Comparable<T>> T smallest(ArrayList<T> list) {
//        int iterCount = list.size();
//        T minValue = list.get(0);
//        for (int i = 0; i < iterCount; i++) {
//            if (list.get(i).compareTo(minValue) < 0) {
//                minValue = list.get(i);
//            }
//        }
//        System.out.println("Smallest value in array: " + minValue);
//        return minValue;
//    }
}
