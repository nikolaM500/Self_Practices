package Bikes;

public class Bicycle {

    public static boolean hasTwoWheels, hasSeat, passSafetyInspection;
    boolean hasSpeeds, hasSpeedometer;
    int numOfSpeeds;
    double sizeOfWheels,widthOfTires,price;
    String sizeOfFrame;


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




}
