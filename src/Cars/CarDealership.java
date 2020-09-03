package Cars;

public class CarDealership {


    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Audi","A6","Silver","Automatic",2015,"Luxury","Quatro");
        Convertible conv1 = new Convertible("BMW","335i","Black","Manual",2013,"Luxury","RWD");
        SUV suv1 = new SUV("Jeep","GC","Gray","Automatic",2014,"Economic","RWD",false,false,false);

        System.out.println("sedan");
        sedan1.start();
        sedan1.setHasSunRoof(true);
        sedan1.sunRoofOpen=true;
        sedan1.openSunRoof();
        sedan1.turnOffAC();
        System.out.println();

        System.out.println("suv");
        suv1.turnOn_OffRoadMode();
        suv1.closeSunRoof();
        System.out.println();

        System.out.println("convertible");
        conv1.setHardTop();
        conv1.openSunRoof();
        conv1.start();
        conv1.isDriving();
        conv1.putTopDown();




    }


}
