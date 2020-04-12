package ru.rickSanchez.company.class_work_3;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("jan");
        set.add("feb");
        set.add("mar");
        set.add("apr");
        set.add("may");

        System.out.println(set);
    }

    private static void alBoxLLExample() {
        Box box1 = new Box(1,1);
        Box box2 = new Box(2,2);
        Box box3 = new Box(3,3);
        Box box4 = new Box(4,4);
        ArrayList<Box> list = new ArrayList<>();
        list.add(box1);
        list.add(box2);
        list.add(box3);
        list.add(box4);

        Box b = new Box(1,1);
        System.out.println(list);

        System.out.println(Integer.toHexString(box1.hashCode()));
        System.out.println(Integer.toHexString(b.hashCode()));

        System.out.println(list.contains(b));
    }

    private static void alSimpleExample() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Java");
        list.add("World");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(String s : list) {
            System.out.println(s);
        }
    }
}
