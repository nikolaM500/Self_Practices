package Devices;

public class Iphone extends Phone{
/*initialize all the variables using constructor & static block
if price is higher than $1500, throw a runtime exception with
a message of "Iphone' price cannot be higher than $1500"
                methods: call, text, toString, faceTime*/
    public Iphone(String model, double price, double screenSize, boolean touchScreen) {
        super(model, price, screenSize, touchScreen);
        if (price>1500){
            throw new RuntimeException("\"Iphone ' price cannot be higher than $1500\"");
        }
    }

    static {
        operatingSystem="IOS";
        madeIn="USA";
        brand="Apple";
    }

    public void faceTime(long n){
        System.out.println("face-timing number: "+ n);
    }

}
