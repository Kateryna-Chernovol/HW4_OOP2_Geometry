package com.cursor.generic;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("1)");
        System.out.println("___Generic Class <T extends Number>___");
        MyList<Integer> myList1 = new MyList<>();
        myList1.add(11);
        myList1.add(1);
        myList1.add(8);
        myList1.add(5);
        myList1.add(12);

        for (Integer element : myList1.arrList)
            System.out.print(element + "  ");
        System.out.println();
        myList1.largest(myList1.arrList);
        myList1.smallest(myList1.arrList);

        System.out.println();

        System.out.println("2)");
        System.out.println("___Generic Class <T extends Comparable<T>>___");
        System.out.println(". . . . . For Integers . . . . .");
        MyListSecond<Integer> myList2 = new MyListSecond<>();
        myList2.add(11);
        myList2.add(1);
        myList2.add(8);
        for (Integer element : myList2.list)
            System.out.print(element + "  ");
        System.out.println();
//        myList3.largest(myList2.list);
//        myList3.smallest(myList2.list);
        System.out.println(". . . . . For Strings . . . . .");
        MyListSecond<String> myList3 = new MyListSecond<>();
        myList3.add("Emily");
        myList3.add("David");
        myList3.add("Jorge");
        for (String element : myList3.list)
            System.out.print(element + "  ");
        System.out.println();
        System.out.println();
//        myList3.largest(myList3.list);
//        myList3.smallest(myList3.list);

        System.out.println("3)");
        System.out.println("_____Generic Class with constructor_____");
        System.out.println(". . . . . For Integers . . . . .");
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(789);
        listInt.add(111);
        listInt.add(593);
        ThirdTask intWork = new ThirdTask(listInt);
        System.out.println(". . . . . For Strings . . . . .");
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("I ");
        listStr.add("like ");
        listStr.add("play ");
        listStr.add("football ");
        ThirdTask strWork = new ThirdTask(listStr);
    }
}
