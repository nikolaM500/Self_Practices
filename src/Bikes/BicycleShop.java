package Bikes;

public class BicycleShop {

    public static void main(String[] args) {

        RoadBicycle roadBike = new RoadBicycle(true,true,true,true,true,18,24.0,1.2,"Large");

        System.out.println(roadBike.price);

        roadBike.warnPedestrian();

        roadBike.rideBicycle();

        System.out.println("==========================================");

        HybridBicycle hybBike = new HybridBicycle(true,true,true,12,24,2.2,"Xlarge");
        System.out.println(hybBike.price);
    }


}
