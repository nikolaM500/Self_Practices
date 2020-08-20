package Goemetri;


import java.text.DecimalFormat;

public class Circle {
     /*Create a class called Circle
                variables:
                        radius, pi, diameter
                add a constructor that can initialize the radius of the circle
                instance methods:
                        area(): can return the area of the circle as double
                        perimeter(): cna return the perimeter of the circle as double
                        toString(): returns the info of the circle */

    DecimalFormat  m = new DecimalFormat("0.00");


    double radius;
    double diameter;

    static double pi = 3.14;


    public Circle(double radius){
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double area(){
        double a = radius*radius*pi;
        return a;
    }

    public double perimeter(){
        double per = 2*pi*radius;
        return per;
    }

    public String toString(){
        return "For the circle of radius: "+radius+", diameter is: "+m.format(diameter)+
                "\narea is: "+m.format(area())+", and perimeter is: "+m.format(perimeter())+"\n";
    }

}
