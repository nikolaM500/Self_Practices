package AutoDealer;

public class Autos {

    String make;
    String model;
    int year;
    String color;
    boolean automatic;
    static boolean hasAC;
/*
    public Autos(String make, String model,int year,String color,boolean automatic){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.automatic=automatic;
    }

 */

    static {
        hasAC=true;
    }

    public String toString(){
        String transmission = "";
        if (automatic){
            transmission="automatic transmission";
        }else {
            transmission="manual transmission";
        }
        return ""+year+", "+make+" "+model+", "+color+", "+transmission;
    }

    public void searchCar(String make,String model){
        this.make=make;
        this.model=model;
    }

    public void setInfo(String make, String model,int year,String color,boolean automatic){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.automatic=automatic;
    }



}
