package Cars;

public class SUV extends Car{
    public boolean offRoadMode, awd, thirdRowSeats, turnOnOffRoad;
    //String category, powertrain;

    public SUV(String make, String model, String color, String transmission,
                        int year, String category, String powertrain,boolean offRoadMode,
                        boolean awd,boolean thirdRowSeats) {
        setInfo(make, model, color, transmission, year, category, powertrain);
        this.offRoadMode=offRoadMode;
        this.awd=awd;
        this.thirdRowSeats=thirdRowSeats;
    }

    public void turnOn_OffRoadMode(){
        if (!offRoadMode){
            System.out.println("Option not available");
        }else if(turnOnOffRoad) {
            System.out.println("Off road mode is already on");
        }else {
            turnOnOffRoad=true;
            System.out.println("Off road mode is now on.");
        }
    }

    public void turnOff_OffRoadMode(){
        if (!offRoadMode){
            System.out.println("You are fine");
        }else if(turnOnOffRoad) {
            turnOnOffRoad=false;
            System.out.println("Off road mode is now off");
        }else {
            System.out.println("Off road mode is already off.");
        }
    }




}
