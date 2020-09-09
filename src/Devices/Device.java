package Devices;

public class Device {
    /*Attributes: brand (static & do not initialize)
Model, price, screenSize
create a constructor that can initialize the instances*/
    public static String brand;
    String model;
    double price, screenSie;



    public Device(String model, double price, double screenSize){
        this.model=model;
        this.price=price;
        this.screenSie=screenSize;
    }
}
