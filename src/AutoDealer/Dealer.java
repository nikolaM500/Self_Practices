package AutoDealer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dealer {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = "";
        String md = "";
        int yr = 0;
        String cl = "";
        boolean trns = true;
        int deleteCarNumber=0;
        ArrayList<Autos> inventory = new ArrayList<>();
        ArrayList<Autos> addingCars = new ArrayList<>();

        Autos a1 = new Autos();
        Autos a2 = new Autos();
        Autos a3 = new Autos();
        Autos a4 = new Autos();
        Autos a5 = new Autos();
        Autos a6 = new Autos();
        Autos a7 = new Autos();
        Autos a8 = new Autos();
        Autos a9 = new Autos();
        Autos a10 = new Autos();
        Autos a11 = new Autos();
        Autos a12 = new Autos();
        Autos a13 = new Autos();
        Autos a14 = new Autos();
        Autos a15 = new Autos();
        Autos a16 = new Autos();
        Autos a17 = new Autos();
        Autos a18 = new Autos();
        Autos a19 = new Autos();
        Autos a20 = new Autos();





        inventory.addAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));
        addingCars.addAll(Arrays.asList(a11,a12,a13,a14,a15,a16,a17,a18,a19,a20));

        a1.setInfo("Audi","A6",2014,"white",true);
        a2.setInfo("Audi","A6",2015,"black",true);
        a3.setInfo("Audi","A8",2018,"white",true);
        a4.setInfo("Audi","A7",2013,"gray",true);
        a5.setInfo("Audi","A7",2014,"white",true);
        a6.setInfo("Audi","A7",2015,"silver",true);
        a7.setInfo("Audi","A4",2019,"silver",true);
        a8.setInfo("Audi","Q5",2012,"gray",true);
        a9.setInfo("Audi","Q7",2013,"black",true);
        a10.setInfo("Audi","Q7",2015,"gray",true);

        System.out.println("Inventory: ");
        for (Autos each : inventory) {
            System.out.println(each);
        }
        System.out.println("============================================");
        System.out.println("Currently "+inventory.size()+" cars in the inventory\n");
        System.out.println("Do you want to add a car? Y - N");
        String s = sc.nextLine();
        while (s.equalsIgnoreCase("Y")){
            System.out.println("make:");
            ma = sc.nextLine();
            System.out.println("model:");
            md = sc.nextLine();
            System.out.println("color:");
            cl = sc.nextLine();
            System.out.println("year:");
            yr = sc.nextInt();
            sc.nextLine();
            System.out.println("automatic? ");
            trns = sc.nextBoolean();
            addingCars.get(0).setInfo(ma,md,yr,cl,trns);
            inventory.add(addingCars.get(0));
            addingCars.remove(0);
            sc.nextLine();
            System.out.println("Do you want to add another car? Y - N");
            s = sc.nextLine();
        }

        System.out.println("Do you want to remove a car? Y - N");
        String s1 = sc.nextLine();
        int i = 1;
        while (s1.equalsIgnoreCase("y")){
            for (Autos each : inventory) {
                System.out.println(""+i+". "+each);
                i++;
            }
            System.out.println("Which car you want to remove? ");
            deleteCarNumber = sc.nextInt() - 1;
            inventory.remove(deleteCarNumber);
            sc.nextLine();
            System.out.println("Do you want to remove another car? Y - N");
            s1 = sc.nextLine();
        }

        System.out.println(inventory.size());
        System.out.println();
        for (Autos each : inventory) {
            System.out.println(each);
        }


    }





}
