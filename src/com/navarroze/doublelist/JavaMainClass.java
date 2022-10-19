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
        list1.addStart(1);
        list1.addStart(1);
        list1.addEnd(10);
        list1.addEnd(20);
        list1.addEnd(15);
        list1.addEnd(1);
        list1.addEnd(1);
        System.out.println("List next\n"
                + list1.listNext());
        list1.removeNode(1);
        System.out.println("List next\n"
                + list1.listNext());
        DoubleList list2 = new DoubleList();
        list2.addNodeAsc(5);
        list2.addNodeAsc(1);
        list2.addNodeAsc(0);
        list2.addNodeAsc(6);
        list2.addNodeAsc(3);
        list2.addNodeAsc(2);
        list2.addNodeAsc(9);
        list2.addNodeAsc(4);
        System.out.println("List next\n"
                + list2.listNext());
        DoubleList list3 = new DoubleList();
        list3.addNodeDesc(1);
        list3.addNodeDesc(4);
        list3.addNodeDesc(0);
        list3.addNodeDesc(10);
        list3.addNodeDesc(9);
        list3.addNodeDesc(5);
        list3.addNodeDesc(3);
        list3.addNodeDesc(2);
        list3.addNodeDesc(7);
        System.out.println("List next\n"
                + list3.listNext());
        
}
    
}
