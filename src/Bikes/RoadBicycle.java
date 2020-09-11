package Bikes;

//import java.util.Scanner;

public class RoadBicycle extends Bicycle{

   // Scanner in = new Scanner(System.in);
    boolean hasTheLights,hasTheBell,watterBottle;
    private boolean hasRadio = false;
    private boolean bagRack = false;


    public boolean isBagRack() {
        return bagRack;
    }

    public void setBagRack(boolean bagRack) {
        System.out.println("Adding bag rack will increase the price for 30$. \nWould you like to add the Bag rack? Y - N");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")){
           bagRack=true;
            price+=30;
        }else {
            bagRack=false;
        }
        this.bagRack = bagRack;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {

        System.out.println("Adding radio will increase the price for 50$. \nWould you like to add the radio? Y - N");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            hasRadio=true;
            price+=50;
        }else {
            hasRadio=false;
        }
        this.hasRadio = hasRadio;
    }

    public RoadBicycle(boolean hasSpeeds, boolean hasTheBell, boolean hasSpeedometer, boolean hasTheLights, boolean watterBottle,
                       int numOfSpeeds, double sizeOfWheels, double widthOfTires, String sizeOfFrame) {
        super(hasSpeeds, hasSpeedometer, numOfSpeeds, sizeOfWheels, widthOfTires, sizeOfFrame);
        this.hasTheLights=hasTheLights;
        this.watterBottle=watterBottle;
        this.hasTheBell=hasTheBell;
        if (hasTheBell){
            price+=5;
        }
        if (hasTheLights){
            price+=20;
        }
        if (watterBottle){
            price+=10;
        }
    }

    @Override
    public void checkTires() {
        System.out.println("Tires should be 110 psi");
    }

    @Override
    public void rideBicycle() {
        System.out.println("Watch for traffic, obey the law");
    }

    public void warnPedestrian(){
        if (hasTheBell){
            System.out.println("Ring the Bell");
        }else{
            System.out.println("Brake and yell");
        }
    }

    @Override
    public void brake() {
        System.out.println("Use hand brake");
    }

    public String toString() {
        return
                "Road Bicycle:"+
                "\nhasSpeeds=" + hasSpeeds +
                        ", hasSpeedometer=" + hasSpeedometer +
                        ", numOfSpeeds=" + numOfSpeeds +
                        ", \nsizeOfWheels=" + sizeOfWheels +
                        ", sizeOfFrame='" + sizeOfFrame
                        +"\ntotal price is: "+price;
    }
}
