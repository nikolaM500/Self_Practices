package Bikes;

public class InvalidMotorPower extends RuntimeException{

    public InvalidMotorPower(double d) {
        super("Motor Power Invalid");
        if (d<=0){
            System.err.println("Motor power must be more then 0 kw");
        }else if (d>20){
            System.err.println("Motor power cant be more then 20 kw");
        }
    }
}
