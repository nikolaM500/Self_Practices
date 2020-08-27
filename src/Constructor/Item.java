package Constructor;
/*instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info
                    as calculated by calcCost()
*/


import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Item {

    String name;
    double unitPrice;
    int quantity;
    static double stateTax;
    static double federalTax;

    static {
        stateTax = 0.08;
        federalTax = 0.21;
    }

    public Item(String name, int quantity, double unitPrice){
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }



    public double calcCost(){
        return unitPrice*quantity;
    }
    public String toString(){
        return name+" $"+unitPrice+" price "+calcCost()+"$";
    }

    public double getStateTax(){
        return calcCost()*stateTax;
    }
    public double getFederalTax(){
        return calcCost()*federalTax;
    }

    public double totalTax(){
        return getFederalTax()+getStateTax();
    }



}
