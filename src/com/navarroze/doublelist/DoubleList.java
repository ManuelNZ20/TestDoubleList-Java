package com.navarroze.doublelist;

public class DoubleList {
    
    private Node start;
    private Node end;
    
    public DoubleList(){
        start = end = null;
    }
    
    public boolean isEmpty(){
        return start==null;
    }
    
    public void addStart(int date){
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        }else{/// null <- 3 -> <- 1 -> <- 5 -> null 
            newnode.setNext(start);
            start.setPrevious(newnode);
            start = newnode;
        }
    }
    
    public String listNext(){
        String list = "";
        for(Node i=start;i!=null;){
            list += (i.getNext()==null)?(i.getDate()+" <-> null"):(i.getDate()+" <-> ");
            i = i.getNext();
        }
        return list;
    }
    
    public String listPrevious(){
        String list = "";
        for(Node i=end;i!=null;){
            list += (i.getPrevious()==null)?(i.getDate()+" <-> null"):(i.getDate()+" <-> ");
            i = i.getPrevious();
            
        }
        return list;
    }
    
    
}
