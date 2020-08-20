package Goemetri;

import java.text.DecimalFormat;

public class Rectangle {

    /*Create a class called Rectangle
                instance variables:
                    length, width
                add a constructor that initialize the fileds
                instance methods:
                        area(): can return the area of the rectangle as double
                        perimeter(): cna return the perimeter of the rectangle as double
                        toString(): returns the info of the rectangle objects*/
    DecimalFormat m = new DecimalFormat("0.00");

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length= length;
        this.width=width;
    }

    public double area(){
        double a = length*width;
        return a;
    }

    public double perimeter(){
        double p = 2*length+2*width;
        return  p;
    }

    public String toString(){
        return "For the rectangle of length: "+length+", and width: "+width+
                "\narea is: "+m.format(area())+", and perimeter is: "+m.format(perimeter())+"\n";
    }


}
