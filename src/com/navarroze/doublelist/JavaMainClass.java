package com.navarroze.doublelist;

public class JavaMainClass {

    public static void main(String[] args) {
        DoubleList list1 = new DoubleList();
        list1.addStart(1);
        list1.addStart(4);
        list1.addStart(7);
        list1.addStart(1);
        list1.addStart(2);
        list1.addStart(0);
        list1.addStart(5);
        list1.addEnd(10);
        list1.addEnd(20);
        list1.addEnd(15);
        System.out.println("List next\n"
                + list1.listNext());
        System.out.println("List previous\n"
                + list1.listPrevious());
    }
    
}
