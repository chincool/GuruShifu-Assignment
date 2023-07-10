package com.thoughtworks.rectangle;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(){
        length = 0;
        breadth = 0;
    }

    public Rectangle(int l,int b)
    {
        length = l;
        breadth = b;
    }

    public int calculateArea()
    {
        return length*breadth;
    }
}
