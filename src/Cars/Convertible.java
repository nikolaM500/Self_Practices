package Cars;

public class Convertible extends Car{
    public boolean hardTop, topDown;
    //String category, powertrain;



    public Convertible(String make, String model, String color, String transmission, int year, String category, String powertrain) {
        setInfo(make, model, color, transmission, year, category, powertrain);
    }

    public void putTopDown(){
        if (vehicleIsMoving){
            System.out.println("Stop the vehicle first\nCar must be completely stopped for roof to go down");
        } else if (!vehicleIsMoving && engineRuns && !topDown){
            System.out.println("Top is going down now");
            topDown=true;
        } else if (!engineRuns){
            System.out.println("To put the top down engine must be running.");
        } else if (topDown){
            System.out.println("Top is already down");
        }

    }

    public void getTopUp(){
        if (topDown && engineRuns && !vehicleIsMoving){
            System.out.println("Top is coming up");
            topDown=false;
        }else if (!topDown){
            System.out.println("Top is already up");
        }else if (!engineRuns){
            System.out.println("Engine must be running");
        }else if (vehicleIsMoving){
            System.out.println("Vehicle must completely stop first");
        }

    }

    public void isHardTop() {
        if (hardTop){
            System.out.println("It is hard-top convertible");
        }else {
            System.out.println("It is soft-top convertible");
        }
    }

    public void setHardTop() {
        this.hardTop = true;
    }

    public boolean isTopDown() {
        return topDown;
    }

    public void setTopDown(boolean topDown) {
        this.topDown = topDown;
    }


    public void openSunRoof() {
        if (hasSunRoof && sunRoofOpen){
            System.out.println("Sunroof is open, to open the top pullover and press \"top-down\"");
        }else if (hasSunRoof && !sunRoofOpen){
            sunRoofOpen=true;
            System.out.println("Sunroof opening");
        }else {
            System.out.println("Option not available");
        }
    }

    public void closeSunRoof() {
        if (hasSunRoof && sunRoofOpen){
            sunRoofOpen=true;
            System.out.println("Sunroof closing");

        }else if (hasSunRoof && !sunRoofOpen){
            System.out.println("Sunroof is closed");
        }else {
            System.out.println("Option not available");
        }
    }


}
