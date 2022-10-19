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

    public void removeStart() {
        if (start == end) {
            start = end = null;
        } else {
            Node aux = start;
            start = start.getNext();
            start.setPrevious(null);
            aux.setNext(null);
        }
    }

    public void removeEnd() {
        if (start == end) {
            start = end = null;
        } else {
            Node aux = end;
            end = end.getPrevious();
            end.setNext(null);
            aux.setPrevious(null);
        }
    }

    public void removeNode(int date) {
        Node i = start, j = null, aux = null;
        while (i != null) {
            if (i.getDate() == date) {
                if (j == null) {
                    if (start == end) {
                        start = end = null;
                    } else {
                        aux = start;
                        start = start.getNext();
                        start.setPrevious(null);
                        aux.setNext(null);
                    }
                    i = start;
                    j = null;
                } else {
                    aux = i;
                    if (i == end) {
                        end = j;
                        end.setNext(null);
                        i = null;
                    } else {
                        i = i.getNext();
                        i.setPrevious(j);
                        j.setNext(i);
                    }
                    aux.setNext(null);
                    aux.setPrevious(null);
                }
            } else {
                j = i;
                i = i.getNext();
            }
        }
    }

    public void ordered(){
        int aux = 0;
        Node i = start,j;
        while(i!=null){
            j = i.getNext();
            while(j!=null){
                if (i.getDate()>j.getDate()) {
                    aux = i.getDate();
                    i.setDate(j.getDate());
                    j.setDate(aux);
                }
                j = j.getNext();
            }
            i = i.getNext();
        }
    }
    
    public void addNodeAsc(int date){
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        }else if(newnode.getDate()<start.getDate()){
            start.setPrevious(newnode);
            newnode.setNext(start);
            start = newnode;
        }else{
            Node cur = start.getNext(),prev = null;
            boolean enc = false;
            while(cur!=null&&!enc){/// 1 4 5 7 8 10
                if (cur.getDate()>newnode.getDate()) {
                    if(prev==null)
                    {
                        start.setNext(newnode);
                        newnode.setPrevious(start);
                        newnode.setNext(cur);
                        cur.setPrevious(newnode);
                    }else{
                        newnode.setPrevious(prev);
                        prev.setNext(newnode);
                        newnode.setNext(cur);
                        cur.setPrevious(newnode);
                    }
                    enc = true;
                }else{
                    prev = cur;
                    cur = cur.getNext();
                }
            }
            if (!enc) {
                end.setNext(newnode);
                newnode.setPrevious(end);
                end = newnode;
            }
        }
    }
    
    public void addNodeDesc(int date){
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        }else if(start.getDate()<newnode.getDate()){
            newnode.setNext(start);
            start.setPrevious(newnode);
            start = newnode;
        }else{
            Node cr = start.getNext(), pr = null;
            boolean enc = false;
            while(cr!=null&&!enc){
                if (cr.getDate()<newnode.getDate()) {
                    if (pr==null) {
                        start.setNext(newnode);
                        newnode.setPrevious(start);
                        newnode.setNext(cr);
                        cr.setPrevious(newnode);
                    }else{
                        pr.setNext(newnode);
                        newnode.setPrevious(pr);
                        cr.setPrevious(newnode);
                        newnode.setNext(cr);
                    }
                    enc = true;
                }else{
                    pr = cr;
                    cr = cr.getNext();
                }
            }
            if (!enc) {
                end.setNext(newnode);
                newnode.setPrevious(end);
                end = newnode;
            }
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
