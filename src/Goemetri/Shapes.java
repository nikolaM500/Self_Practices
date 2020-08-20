package Goemetri;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;


public class Shapes {

    /* create a class called Shapes:
                create an arraylist of circle and add 5 objects of circle
                find out the circles that has max and min area
                create a an arraylist of rectangle and add 5 objects of rectangle
                find out the rectangles that has max and min area*/

    public static void main(String[] args) {
        DecimalFormat m = new DecimalFormat("0.00");

        ArrayList<Circle> circleList = new ArrayList<>();

        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle(2.3);
        Circle c3 = new Circle(2);
        Circle c4 = new Circle(3.5);
        Circle c5 = new Circle(1.75);

        circleList.addAll(Arrays.asList(c1,c2,c3,c4,c5));

        for (Circle each : circleList) {
            System.out.println(each);
        }

        double maxArea = circleList.get(0).area();
        double minArea = circleList.get(0).area();

        for(Circle each : circleList){
            if(each.area()>maxArea){
                maxArea= each.area();
            }
            if(each.area()< minArea){
                minArea = each.area();
            }
        }
        System.out.println("Maximum Area: "+ m.format(maxArea));
        System.out.println("Minimum Area: "+ m.format(minArea));

        System.out.println();
        System.out.println();

        ArrayList <Rectangle> rectangleList = new ArrayList<>();
        Rectangle rect1 = new Rectangle(8.6,2.3);
        Rectangle rect2 = new Rectangle(4.8,2.8);
        Rectangle rect3 = new Rectangle(3.4,2.5);
        Rectangle rect4 = new Rectangle(3.2,2.8);
        Rectangle rect5 = new Rectangle(7.8,3.5);



        rectangleList.addAll(Arrays.asList(rect1,rect2, rect3, rect4, rect5));

        for (Rectangle each : rectangleList) {
            System.out.println(each);
        }

        double maxRectangleArea = rectangleList.get(0).area();
        double minRectangleArea = rectangleList.get(0).area();



        for(Rectangle each : rectangleList){
            if(each.area() > maxRectangleArea){
                maxRectangleArea = each.area();
            }
            if(each.area()<minRectangleArea){
                minRectangleArea = each.area();
            }
        }
        System.out.println("Maximum Area: "+ m.format(maxRectangleArea));
        System.out.println("Minimum Area: "+ m.format(minRectangleArea));


    }
}
