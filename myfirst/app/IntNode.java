package com.myfirst.app;

/**
 * Created by bikash on 8/12/15.
 */
public class IntNode {
    public int data;
    public IntNode next;

    public IntNode(int data, IntNode next)
    {
        this.data=data;
        this.next = next;

    }
    public String toString()
    {
        return data +"";

    }
}
