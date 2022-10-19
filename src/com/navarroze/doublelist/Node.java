package com.navarroze.doublelist;

public class Node {
    private int date;
    private Node next;
    private Node previous;
    
    public Node(int date,Node next,Node previous){
        this.date = date;
        this.next = next;
        this.previous = previous;
    }
    
    public Node(int date){
        this(date, null, null);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
}
