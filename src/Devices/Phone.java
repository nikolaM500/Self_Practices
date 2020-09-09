package Devices;
/*static variables: brand , OperatingSystem, made in(do not initialize them)
instance variables:     Model, price, screenSize, touchScreen(boolean)
add a constructor that can initialize all instances (this is should be the only constructor)
if price is lower than $0 throw a runtime exception with a message of "Invalid Price"
 methods: call, text, toString*/
public class Phone extends Device{

    boolean touchScreen;
    static String operatingSystem, madeIn;



    public Phone(String model, double price, double screenSize, boolean touchScreen) {

        super(model, price, screenSize);
        this.touchScreen=touchScreen;
        if (price<0){
            throw new RuntimeException("Invalid Price");
        }

    }

    public void call(){
        System.out.println(model+" calling the number");
    }

    public void text(){
        System.out.println(model+" texting the number");
    }

    @Override
    public String toString() {
        return
                "touchScreen=" + touchScreen +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screenSie=" + screenSie;
    }
}
