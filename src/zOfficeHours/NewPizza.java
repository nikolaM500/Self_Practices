package zOfficeHours;

import java.util.ArrayList;

public class NewPizza {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza();

        pizza1.set("large",5,3);

        System.out.println(pizza1);

        ArrayList<Pizza> pizzaForBatch20 = new ArrayList<>();

        for(int i =0; i < 400; i++) {
            Pizza myPizza = new Pizza();
            myPizza.set("Large", 2, 2);
            pizzaForBatch20.add(myPizza);
        }

        System.out.println("Total Number of Pizza: "+pizzaForBatch20.size());
        double totalPrice = 0;

        for(Pizza each  : pizzaForBatch20){
            totalPrice  += each.calcCost();
        }

        System.out.println("Total Price: $"+totalPrice);
    }

}
