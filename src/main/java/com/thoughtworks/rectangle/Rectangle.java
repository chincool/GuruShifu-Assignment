package com.thoughtworks.rectangle;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public double area()
    {
        return length*breadth;
    }
}
