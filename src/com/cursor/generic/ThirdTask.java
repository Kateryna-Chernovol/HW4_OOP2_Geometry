package com.cursor.generic;

import java.util.ArrayList;

public class ThirdTask<T extends Comparable<T>> {

    public ThirdTask(ArrayList<T> list) {
        highestValue(list);
        lowestValue(list);
    }

    public <T extends Comparable<T>> T highestValue(ArrayList<T> list) {
        int iterCount = list.size();
        T maxValue = list.get(0);
        for (int i = 0; i < iterCount; i++) {
            if (list.get(i).compareTo(maxValue) > 0) {
                maxValue = list.get(i);
            }
        }
        System.out.println("Highest value in array: " + maxValue);
        return maxValue;
    }

    public <T extends Comparable<T>> T lowestValue(ArrayList<T> list) {
        int iterCount = list.size();
        T minValue = list.get(0);
        for (int i = 0; i < iterCount; i++) {
            if (list.get(i).compareTo(minValue) < 0) {
                minValue = list.get(i);
            }
        }
        System.out.println("Lowest value in array: " + minValue);
        return minValue;
    }

}
