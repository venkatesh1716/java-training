package com.trimindtech.training.home03;

public class Rectangle {
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double length;
    private  double width;
    public double area()
    {
       double area = length * width;
        System.out.println("area is "+area);
       return area;
    }
    public  double perimeter()
    {
        double perimeter = 2*(length*width);
        System.out.println("perimeter is"+perimeter);
        return perimeter;
    }
}
