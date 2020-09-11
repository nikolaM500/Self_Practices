package Bikes;

import java.util.Scanner;

public class HybridBicycle extends Bicycle{

    boolean hasElectricMotor;
    double motorPower;

    public HybridBicycle(boolean hasSpeeds,boolean hasElectricMotor, boolean hasSpeedometer, int numOfSpeeds, double sizeOfWheels, double widthOfTires, String sizeOfFrame) {
        super(hasSpeeds, hasSpeedometer, numOfSpeeds, sizeOfWheels, widthOfTires, sizeOfFrame);
        price+=200;
        Scanner scan = new Scanner(System.in);
        this.hasElectricMotor=hasElectricMotor;
        if (hasElectricMotor){
            price+=300;
            System.out.println("What is the power of the motor in kw?");
            this.motorPower=scan.nextDouble();
        }
        if (motorPower<=0){
           throw new InvalidMotorPower(motorPower);
        }else if (motorPower>5 && motorPower<10){
            price+=200;
        }else if (motorPower<15){
            price+=400;
        }else if (motorPower<=20){
            price+=600;
        }else if (motorPower>20){
            throw new InvalidMotorPower(motorPower);
        }


    }
}
