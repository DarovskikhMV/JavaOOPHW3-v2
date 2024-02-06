package list.impl;

import list.GBList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(4);
        list.remove(1);
        System.out.println(list);
    }

}
