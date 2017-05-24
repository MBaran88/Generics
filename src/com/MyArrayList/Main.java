package com.MyArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Ola");
        list.add("Zenon");
        list.add("Ksawery");

        for (int i = 0; i <list.getSize() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
