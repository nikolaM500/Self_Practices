package Devices;

public class Nokia extends Phone{
    /*initialize all the variables using constructor & static block
if price is higher that $50, throw a runtime exception with a message of
 "Nokia Phone' price cannot be higher than $50"
 methods: call, text, toString, breakTheFloor*/

    static {
        operatingSystem="Symbian";
        madeIn="Finland";
        brand="Nokia";
    }

    public Nokia(String model, double price, double screenSize, boolean touchScreen) {
        super(model, price, screenSize, touchScreen);
        if (price>50){
            throw new RuntimeException("\"Nokia Phone' price cannot be higher than $50\"");
        }
    }

    public void breakTheFloor(){
        if (model.equalsIgnoreCase("3310") || model.equalsIgnoreCase("3330")){
            System.out.println("There is a warning on the product not to drop it on the floor\n" +
                    "We won't pay for your floor repair");
        }else {
            System.out.println("This option is available only for 3310 and 3330");
        }
    }

}
