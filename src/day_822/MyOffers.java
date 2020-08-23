package day_822;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer of1 = new Offer("Austin","Envalon","SDET",115000,true,false);
        Offer of2 = new Offer("Chicago","Ch-tech","QA",92000,false,false);
        Offer of3 = new Offer("Pittsburgh","PCI","SDET", 120000,false,false);
        Offer of4 = new Offer("Phoenix","Matrix","SDET",120000,true,true);
        Offer of5 = new Offer("Portland","OrSoft","SDET",135000,true,true);

        ArrayList<Offer> list = new ArrayList<>();
        ArrayList<Offer> list1 = new ArrayList<>();
        ArrayList<Offer> list2 = new ArrayList<>();
        ArrayList<Offer> list3 = new ArrayList<>();
        list.addAll(Arrays.asList(of1,of2,of3,of4,of5));
        list1.addAll(list);
        list2.addAll(list);
        list3.addAll(list);

        for (Offer each : list) {
            System.out.println(each);
        }

        list1.removeIf(p-> !p.isFullTime);
        System.out.println("This are full-time\n");
        for (Offer each : list1) {
            System.out.println(each);
        }

        list2.removeIf(p -> !p.location.equalsIgnoreCase("Austin") && !p.location.equalsIgnoreCase("Chicago"));
        System.out.println("This are from desired cities\n");

        for (Offer each : list2) {
            System.out.println(each);
        }

        list3.removeIf(p->!p.isOnTheWestCoast);
        System.out.println("This are offers from the West Coast:\n");
        for (Offer each : list3) {
            System.out.println(each);
        }
        System.out.println();

        System.out.println("This are outstanding offers:\n");
        for (Offer each : list ) {
            int count = 0;
            if (list1.contains(each)){
                count++;
            }
            if (list2.contains(each)){
                count++;
            }
            if (list3.contains(each)){
                count++;
            }
            if (count>1){
                System.out.println(each);
            }


        }

    }
}
