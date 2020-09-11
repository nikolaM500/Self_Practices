package Bikes;

public class RoadBicycle extends Bicycle{

    boolean hasTheLights,hasTheBell,watterBottle;



    public RoadBicycle(boolean hasSpeeds,boolean hasTheBell, boolean hasSpeedometer,boolean hasTheLights, boolean watterBottle,
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


}
