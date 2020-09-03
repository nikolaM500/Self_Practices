package Cars;

public class Car {
    public String make, model, color, transmission, category, powertrain;
    public int year;
    private String vin;
    public  boolean acOn, radioON, hasSunRoof,sunRoofOpen, vehicleIsMoving, engineRuns;
    public static boolean hasAC, hasRadio;

    static {
        hasAC=true;
        hasRadio=true;
    }


    public void setInfo(String make, String model, String color, String transmission,
                        int year,String category, String powertrain) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.year = year;
        this.category=category;
        this.powertrain=powertrain;
    }

    public void getVin() {
        System.out.println(vin);
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void turnOnAC(){
        if (acOn){
            System.out.println("AC is on");
        }else {
            acOn=true;
        }
    }

    public void turnOffAC(){
        if (!acOn){
            System.out.println("AC is off");
        }else {
            acOn=false;
        }
    }

    public void turnOnRadio(){
        if (radioON){
            System.out.println("Radio is on");
        }else {
            radioON=true;
        }
    }

    public void turnOffRadio(){
        if (!radioON){
            System.out.println("Radio is off");
        }else {
            radioON=false;
        }
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }
    public void openSunRoof(){
        if (!hasSunRoof){ System.out.println("you wish :-)");}else if(sunRoofOpen){
            System.out.println("Sun roof is open");
        }else{sunRoofOpen=true;
            System.out.println("Sunroof is now open");}
    }

    public void closeSunRoof(){
        if (!hasSunRoof){ System.out.println("you are fine :-)");}else if(!sunRoofOpen){
            System.out.println("Sun roof is closed");
        }else{sunRoofOpen=false;}
    }

    public void brake(){
        System.out.println("Car is braking");
    }
    public void speedingUp(){
        System.out.println("Car is speeding up");
    }
    public void start() {
        if (category.equalsIgnoreCase("luxury")){
            System.out.println("Keyless starting");
            engineRuns=true;
        }else {
            System.out.println("Car is starting");
            engineRuns=true;
        }
    }

    public void stops(){
        System.out.println("Car is stopping");
        vehicleIsMoving=false;
    }

    public void parking(){
        System.out.println("Carefully park the vehicle");
    }

    public void isVehicleIsMoving() {
        System.out.println(vehicleIsMoving);
    }

    public void setVehicleIsMoving(boolean vehicleIsMoving) {
        this.vehicleIsMoving = vehicleIsMoving;
    }

    public void isDriving(){
        vehicleIsMoving=true;
    }


}
