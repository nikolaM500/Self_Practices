package Bikes;

import java.util.Scanner;

public class Bicycle {
    Scanner in = new Scanner(System.in);
    public static boolean hasTwoWheels, hasSeat, passSafetyInspection;
    boolean hasSpeeds, hasSpeedometer;
    int numOfSpeeds;
    double sizeOfWheels,widthOfTires,price;
    String sizeOfFrame;
    boolean hasHandPump = false;
    boolean hasSpareTire = false;


    public boolean isHasHandPump() {
        return hasHandPump;
    }

    public void setHasHandPump(boolean hasHandPump) {
        System.out.println("Adding hand pump will increase the price for 15$. \nWould you like to add the hand pump? Y - N");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            hasHandPump=true;
            price+=15;
        }else {
            hasHandPump=false;
        }
        this.hasHandPump = hasHandPump;
    }

    public boolean isHasSpareTire() {
        return hasSpareTire;
    }

    public void setHasSpareTire(boolean hasSpareTire) {
        System.out.println("Adding spare tire will increase the price for 10$. \nWould you like to add the spare tire? Y - N");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            hasSpareTire=true;
            price+=10;
        }else {
            hasSpareTire=false;
        }
        this.hasSpareTire = hasSpareTire;
    }

    static {
        hasSeat=true;
        hasTwoWheels=true;
        passSafetyInspection=true;
    }

    public Bicycle(boolean hasSpeeds, boolean hasSpeedometer,
                   int numOfSpeeds, double sizeOfWheels, double widthOfTires, String sizeOfFrame) {
        this.hasSpeeds = hasSpeeds;
        this.hasSpeedometer = hasSpeedometer;
        this.numOfSpeeds = numOfSpeeds;
        this.sizeOfWheels = sizeOfWheels;
        this.widthOfTires = widthOfTires;
        this.sizeOfFrame = sizeOfFrame;
        if (sizeOfFrame.equalsIgnoreCase("small")){
            price=50;
        }else if (sizeOfFrame.equalsIgnoreCase("medium")){
            price=80;
        }else if (sizeOfFrame.equalsIgnoreCase("large")){
            price=110;
        }else if (sizeOfFrame.equalsIgnoreCase("Xlarge")){
            price=150;
        } else {
            throw new InvalidFrameSize(sizeOfFrame);
        }
        if (hasSpeeds){

            if (numOfSpeeds>24){
                throw new InvalidNumberOfSpeeds(numOfSpeeds);
            }else if (numOfSpeeds>18){
                price += 50;
            }else if (numOfSpeeds<1){
                throw new InvalidNumberOfSpeeds(numOfSpeeds);
            }else {
                price+=30;
            }
        }
        if (hasSpeedometer){
            price+=30;
        }
    }

    public void checkTires(){
        System.out.println("Tires should be fairly hard");
    }

    public void adjustTheSeat(){
        System.out.println("Set the seat so it fits you");
    }

    public void serviceChain(){
        System.out.println("Put some oil on chain");
    }

    public void rideBicycle(){
        System.out.println("Enjoy the ride");
    }

    public void brake(){
        System.out.println("Push pedal reverse");
    }

    @Override
    public String toString() {
        return
                "hasSpeeds=" + hasSpeeds +
                ", hasSpeedometer=" + hasSpeedometer +
                ", numOfSpeeds=" + numOfSpeeds +
                ", \nsizeOfWheels=" + sizeOfWheels +
                ", sizeOfFrame='" + sizeOfFrame
                +"\ntotal price is: "+price;
    }
}
