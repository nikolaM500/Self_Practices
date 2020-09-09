package Devices;

public class Samsung extends Phone{
    /*  initialize all the variables using constructor & static block
if price is higher than $1000, throw a runtime exception with a message of
 "Samsung phone' price cannot be higher than $1000"
                methods: call, text, toString, freeze*/

    static {
        operatingSystem="android";
        madeIn="South Corea";
        brand="Samsung";
    }

    public Samsung(String model, double price, double screenSize, boolean touchScreen) {
        super(model, price, screenSize, touchScreen);
        if (price>1000){
            throw new RuntimeException(" \"Samsung phone' price cannot be higher than $1000\"");
        }
    }

    public void freeze(){
        System.out.println("The s*** is frozen again");
    }


}
