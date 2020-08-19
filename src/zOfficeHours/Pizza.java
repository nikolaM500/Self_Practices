package zOfficeHours;

public class Pizza {

    String size;
    int NumOfCheeseTopping;
    int NumOfPepperoniTopping;

    public void set(String size, int NumOfCheeseTopping, int NumOfPepperoniTopping ){

        this.size=size;
        this.NumOfCheeseTopping=NumOfCheeseTopping;
        this.NumOfPepperoniTopping=NumOfPepperoniTopping;


    }

    public double calcCost(){
        double price = 0;
        switch (size){
            case "small":
                price+=10;
                break;
            case "medium":
                price+=12;
                break;
            case "large":
                price+=14;
                break;
        }

        price=price+(NumOfPepperoniTopping*2)+(NumOfCheeseTopping*2);
        return price;
    }

    public String toString(){
        return "small 10$ medium 12 $ large 14 $"+"\nSize of pizza: "+size+"\n"+NumOfCheeseTopping+" types of cheese "+2*NumOfCheeseTopping+"$"
                +"\n"+NumOfPepperoniTopping+" pepperoni toppings "+2*NumOfPepperoniTopping+"$"+"\nPrice: "+calcCost()+"$";
    }


}
