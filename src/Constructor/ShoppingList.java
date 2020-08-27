package Constructor;

import java.util.ArrayList;
import java.util.Arrays;

/* create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list*/
public class ShoppingList {

    public static void main(String[] args) {

        Item it1 = new Item("banana",6,0.25);
        Item it2 = new Item("milk",2,1.89);
        Item it3 = new Item("eggs",2,3.5);
        Item it4 = new Item("watter",2,5.5);
        Item it5 = new Item("cheese",3,6);

        ArrayList<Item> list = new ArrayList<>();

        list.addAll(Arrays.asList(it1,it2,it3,it4,it5));
        double totalPrice = 0;
        double totalTax = 0;
        for (Item each : list) {
            System.out.println(each);
            totalPrice+=each.calcCost();
            totalTax +=each.totalTax();
        }
        System.out.println();
        System.out.println("Total price: "+totalPrice+"$"+
                "\ntax: "+totalTax+"\nTodays total: "+(totalPrice+totalTax));





    }


}
