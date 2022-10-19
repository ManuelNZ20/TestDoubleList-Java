package com.navarroze.doublelist;

public class DoubleList {

    private Node start;
    private Node end;

    public DoubleList() {
        start = end = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void addStart(int date) {
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        } else {
            newnode.setNext(start);
            start.setPrevious(newnode);
            start = newnode;
        }
    }

    public void addEnd(int date) {
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        } else {
            /// [10] null <- 3 -> <- 1 -> <- 5 -> <- 10 ->  
            end.setNext(newnode);
            newnode.setPrevious(end);
            end = newnode;
        }
    }
    
    public void removeStart()
    {
        if (start==end) {
            start = end = null;
        }else{
            Node aux = start;
            start = start.getNext();
            start.setPrevious(null);
            aux.setNext(null);
        }
    }
    public String listNext() {
        String list = "null <-> ";
        for (Node i = start; i != null;) {
            list += (i.getNext() == null) ? (i.getDate() + " <-> null") : (i.getDate() + " <-> ");
            i = i.getNext();
        }
        return list;
    }

    public String listPrevious() {
        String list = "null <-> ";
        for (Node i = end; i != null;) {
            list += (i.getPrevious() == null) ? (i.getDate() + " <-> null") : (i.getDate() + " <-> ");
            i = i.getPrevious();

        }
        return list;
    }

}
