package com.company;


public class DLink {
    public DLink previous;
    public  String data;
    public DLink next;

    public DLink(String data)
    {
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public DLink(DLink previous, String data, DLink next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public String data() {
        return data;
    }

}
