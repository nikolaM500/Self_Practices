package Devices;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iPhone1 = new Iphone("x",1400,8.2,true);
        Samsung sams1 = new Samsung("S10",900,8.5,true);
        Nokia nok1 = new Nokia("e72",40,1.5,false);

        iPhone1.faceTime(5258554);

        sams1.freeze();

        nok1.breakTheFloor();

        System.out.println(nok1);

        iPhone1.call();

        sams1.text();

    }
}
